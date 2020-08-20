# -*- coding:utf-8 -*-

import os
import sys


def add_init_file(path):
    if not os.path.isabs(path):
        path = os.path.abspath(os.path.join(os.getcwd(), path))

    sub_files = os.listdir(path)
    init_file_path = os.path.abspath(os.path.join(path, '__init__.py'))
    open(init_file_path, 'w')

    for sub_file in sub_files:
        sub_dir = os.path.abspath(os.path.join(path, sub_file))

        if os.path.isdir(sub_dir):
            sub_init_file_path = os.path.abspath(os.path.join(sub_dir, '__init__.py'))
            print("sub dir init file: ", sub_init_file_path)
            open(sub_init_file_path, 'w')
            add_init_file(sub_dir)


if __name__ == '__main__':
    print(sys.argv)
    add_init_file(sys.argv[1])
