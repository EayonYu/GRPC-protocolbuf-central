#! /bin/bash
function read_dir(){
if [ -d $1 ]
then
    cd $1
    touch __inti__.py
    cd ../
fi
for file in `ls $1` #注意此处这是两个反引号，表示运行系统命令
do
 if [ -d $1"/"$file ] #注意此处之间一定要加上空格，否则会报错
 then
 cd $1"/"$file
 touch __inti__.py
 read_dir $1"/"$file
 cd ../
 else
 echo $1"/"$file #在此处处理文件即可
 fi
done
}

#读取第一个参数
read_dir $1