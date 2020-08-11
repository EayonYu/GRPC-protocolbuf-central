# For Windows 10 X64 User,
$protoc_release_version = "3.12.4"

function prepareEnv {
    if ($env:OS -eq 'Windows_NT') {
        if ($env:PROCESSOR_ARCHITECTURE -eq 'x86') {
            $protoc_release_file = "protoc-${protoc_release_version}-win32.zip"
        }
        elseif ($env:PROCESSOR_ARCHITECTURE -eq 'AMD64') {
            $protoc_release_file = "protoc-${protoc_release_version}-win64.zip"
        }
        else {
            Write-Output "Unsupported processor architectures"
        }
    }
    else {
        Write-Output "An unsupported operating system"
    }

    if (-not [String]::IsNullOrEmpty($protoc_release_file)) {
        $fileUrl = "https://github.com/protocolbuffers/protobuf/releases/download/v$protoc_release_version/$protoc_release_file"
        $des = ".\protoc.zip"
        Write-Output  "The download URL is :$fileUrl"
      
        Invoke-WebRequest -uri $fileUrl -OutFile $des
        Unblock-File $des

        $PROTOC_HOME = "$env:USERPROFILE\protoc"
        
        Expand-Archive -Force -Path $des -DestinationPath $PROTOC_HOME 
        setx PROTOC_HOME $PROTOC_HOME
        [System.Environment]::SetEnvironmentVariable('PROTOC_HOME', "$PROTOC_HOME", [System.EnvironmentVariableTarget]::User)
        Write-Output  "The PROTOC_HOME is: $PROTOC_HOME"
        [System.Environment]::SetEnvironmentVariable('PATH', "%PATH%;$PROTOC_HOME\bin", [System.EnvironmentVariableTarget]::User)
        Write-Output  "The user environment variable has been set successfully"
    }
    else {
        Write-Output "Error protoc_release_file name"
    }

    $env:Path = [System.Environment]::GetEnvironmentVariable("Path", "Machine") + ";" + [System.Environment]::GetEnvironmentVariable("Path", "User")
    $protoc_version = $(protoc --version)
    if ($protoc_version -eq 'libprotoc 3.12.4') {
        Write-Output "The download is complete and the environment variable has been set successfully"
        Write-Output "Your protoc version is: $protoc_version"
    }
    else {
        Write-Output "Error: Failed download or user environment variable setting error"
    }
}

function cleanEnv {
    $des = ".\protoc.zip"
    $PROTOC_HOME = "$env:USERPROFILE\protoc"
    Remove-Item -Force $des
    Remove-Item -Force -Recurse $PROTOC_HOME

    [System.Environment]::('PROTOC_HOME', $null, [System.EnvironmentVariableTarget]::User)
    [System.Environment]::SetEnvironmentVariable('PATH', $null, [System.EnvironmentVariableTarget]::User)
}


if ("$args" -eq "prepare") {
    Write-Output "Your input is $args"
    Write-Output "The Function 'prepareEnv' will be executed ..."
    prepareEnv
}
elseif ("$args" -eq "clean") {
    Write-Output "Your input is $args"
    Write-Output "The Function 'cleanEnv' will be executed ..."
    cleanEnv
}
else {
    Write-Output "Your input is $args"
    Write-Output "Please input vaild parmater,it can be 'prepare' or 'clean'"
}