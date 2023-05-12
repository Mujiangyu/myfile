package com.niit.myfile;

import java.io.File;
import java.util.Arrays;

public class FileDemo6 {
    public static void main(String[] args) {
        //列出可用的文件系统根，即获取系统中方所有的盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        //list()    获取当前路径下的所有内容
        File file = new File("E:\\FileTest\\a");
        String[] arr1 = file.list();
        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
