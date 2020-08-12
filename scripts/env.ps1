# This powershell script is for Windows 10 X86/X64 user. it can help to config a rapid development env

# set google protoc version = 3.12.4
$protoc_release_version = "3.12.4"
$GOPATH = $(go env GOPATH)
$protobuf_go_version = "v1.4.2"
$protobuf_swagger_version ="v1.14.6"

function goEnvPrepare {
    go get -u -d -v github.com/golang/protobuf/protoc-gen-go
    git -C "$GOPATH/src/github.com/golang/protobuf" checkout "${protobuf_go_version}"
    go install github.com/golang/protobuf/protoc-gen-go

    go get -u -d -v github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger 
    go get -u -d -v github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
    git -C "$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway" checkout "$protobuf_swagger_version"
    go install github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger
    go install github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway
}


# this is a function. it can download appropriate protoc.zip file and auto config env for you
function prepareEnv {
    # check OS type
    if ($env:OS -eq 'Windows_NT') {
        # check cpu architectures type
        if ($env:PROCESSOR_ARCHITECTURE -eq 'x86') {
            # Decide which file to download,it depend on cpu architectures
            $protoc_release_file = "protoc-${protoc_release_version}-win32.zip"
        }
        elseif ($env:PROCESSOR_ARCHITECTURE -eq 'AMD64') {
            $protoc_release_file = "protoc-${protoc_release_version}-win64.zip"
        }
        else {
            # if architectures is unsupported,output error log
            Write-Output "Unsupported processor architectures"
        }
    }
    else {
        # if os is NOT Windows,output error log
        Write-Output "An unsupported operating system"
    }

    # if protoc.zip file name is NOT null or empty
    if (-not [String]::IsNullOrEmpty($protoc_release_file)) {
        # Construct download link
        $fileUrl = "https://github.com/protocolbuffers/protobuf/releases/download/v$protoc_release_version/$protoc_release_file"
        # output download link for debug
        Write-Output  "The download URL is :$fileUrl"
        # download protoc.zip file
        $des = ".\protoc.zip"
        Invoke-WebRequest -uri $fileUrl -OutFile $des
        Unblock-File $des

        # set PROTOC_HOME path
        $PROTOC_HOME = "$env:USERPROFILE\protoc"
        # unzip protoc.zip to PROTOC_HOME path
        Expand-Archive -Force -Path $des -DestinationPath $PROTOC_HOME
        # set env
        setx PROTOC_HOME $PROTOC_HOME
        [System.Environment]::SetEnvironmentVariable('PROTOC_HOME', "$PROTOC_HOME", [System.EnvironmentVariableTarget]::User)
        Write-Output  "The PROTOC_HOME is: $PROTOC_HOME"
        [System.Environment]::SetEnvironmentVariable('PATH', "%PATH%;$PROTOC_HOME\bin", [System.EnvironmentVariableTarget]::User)
        Write-Output  "The user environment variable has been set successfully"
        
        if (Test-Path "$GOPATH/src/github.com/golang/protobuf") {
            Remove-Item -Force -Recurse   "$GOPATH/src/github.com/golang/protobuf"
        }
        
        goEnvPrepare
    }
    else {
        # output error log
        Write-Output "Error protoc_release_file name"
    }

    # refresh env
    $env:Path = [System.Environment]::GetEnvironmentVariable("Path", "Machine") + ";" + [System.Environment]::GetEnvironmentVariable("Path", "User")
    # get protoc version
    $protoc_version = $(protoc --version)
    # check protoc version
    if ($protoc_version -eq 'libprotoc 3.12.4') {
        Write-Output "The download is complete and the environment variable has been set successfully"
        Write-Output "Your protoc version is: $protoc_version"
    }
    else {
        Write-Output "Error: Failed download or user environment variable setting error"
    }
}

# clean environment for windows
function cleanEnv {
    $des = ".\protoc.zip"
    $PROTOC_HOME = "$env:USERPROFILE\protoc"
    # delete protoc.zip and unziped folder
    if(Test-Path $des){
        Remove-Item -Force $des
    }
    if(Test-Path $PROTOC_HOME){
        Remove-Item -Force -Recurse $PROTOC_HOME
    }

    # reset environment
    [System.Environment]::SetEnvironmentVariable('PROTOC_HOME', $null, [System.EnvironmentVariableTarget]::User)
    [System.Environment]::SetEnvironmentVariable('PATH', $null, [System.EnvironmentVariableTarget]::User)

    Write-Output "Clean finished"
}

if ("$args" -eq "prepare") {
    Write-Output "Your input is $args"
    Write-Output "The Function 'prepareEnv' will be executed ..."
    # run prepareEnv function
    prepareEnv
}
elseif ("$args" -eq "clean") {
    Write-Output "Your input is $args"
    Write-Output "The Function 'cleanEnv' will be executed ..."
    # run cleanEnv function
    cleanEnv
}
else {
    Write-Output "Your input is $args"
    Write-Output "Please input vaild parmater,it can be 'prepare' or 'clean'"
}