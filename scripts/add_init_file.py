# coding:utf-8
import sys,os


def add_init_file(filepath):
    fileNames = os.listdir(filepath)  # 获取当前路径下的文件名，返回List
    file = open(filepath + os.sep + "__init__" + ".py", "w")
    for file in fileNames:
        newDir = filepath + '/' + file  # 将文件命加入到当前文件路径后面
        if os.path.isdir(newDir):  # 如果是文件夹
            print(newDir)
            file = open(newDir + os.sep + "__init__" + ".py", "w")
            add_init_file(newDir)  # 如果不是文件，递归这个文件夹的路径

if __name__ == '__main__':
    print (sys.argv)
    add_init_file(sys.argv[1])
