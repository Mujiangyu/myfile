package com.niit.myfile;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        //获取当前路径下所有的内容

        File f =new File("E:\\FileTest\\a");
        //获取当前路径文件夹里面的所有内容，把所有的内容放到数组中返回
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
