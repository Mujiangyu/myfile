package com.niit.test;

import java.io.File;
import java.io.FilenameFilter;

public class TestDemo2 {
    public static void main(String[] args) {
        //定义一个方法，找到某一个文件夹，查看该文件夹中是否有以avi结尾的电影，不考虑多级目录
        File file = new File("D:\\");
        boolean check = check(file);
        System.out.println(check);

    }

    public static boolean check(File pathName) {
        File[] files = pathName.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }
}
