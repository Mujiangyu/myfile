package com.niit.test;

import java.io.File;

public class TestDemo3 {
    public static void main(String[] args) {
        //找到电脑中所有以avi为结尾的文件(考虑多级文件夹)
       findAVI();
    }

    public static void findAVI(){
        File[] files = File.listRoots();
        for (File file : files) {
            findAVI(file);
        }
    }

    public static void findAVI(File src) {
        File[] files = src.listFiles();
        if(files!=null){
            for (File file : files) {
                if (file.isDirectory()) {
                    findAVI(file);
                } else {
                    if(file.getName().endsWith(".avi"))
                        System.out.println(file);
                }
            }
        }

    }
}
