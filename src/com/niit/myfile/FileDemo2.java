package com.niit.myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //对一个文件的路径进行判断
        File f1 = new File("E:\\FileTest\\a.txt");
        boolean isDir = f1.isDirectory();
        System.out.println(isDir);
        boolean isFile = f1.isFile();
        System.out.println(isFile);
        boolean isExists = f1.exists();
        System.out.println(isExists);

        System.out.println("------------------------------");
        //对一个文件夹的路径进行判断

        File f2 = new File("E:\\FileTest\\b");
        boolean isDir1 = f2.isDirectory();
        System.out.println(isDir1);
        boolean isFile1 = f2.isFile();
        System.out.println(isFile1);
        boolean isExists1 = f2.exists();
        System.out.println(isExists1);
        System.out.println("-------------------");
        //对一个不存在的路径判断
        File f3 = new File("E:\\FileTest\\c");
        boolean isDir2 = f3.isDirectory();
        System.out.println(isDir2);
        boolean isFile2 = f3.isFile();
        System.out.println(isFile2);
        boolean isExists2 = f3.exists();
        System.out.println(isExists2);

    }
}
