package com.niit.myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //根据字符串表示的路径，变成file对象 只是一个路径

        //File表示的是一个存在或者不存在的路径
        String str = "C:\\Users\\刘子豪\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //父路径:C:\Users\刘子豪\Desktop\
        //子路径:a.txt
        String parent = "C:\\Users\\刘子豪\\Desktop\\";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        //把一个file对象表示的路径和string表示的路径进行拼接
        File f3 = new File("C:\\Users\\刘子豪\\Desktop\\");
        File f4 = new File(f3,child);
        System.out.println(f4);
        System.out.println("=================发");


    }
}
