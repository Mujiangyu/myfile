package com.niit.test;

import java.io.File;

public class TestDemo4 {
    public static void main(String[] args) {
        //删除一个多级文件夹
        File file = new File("E:\\FileTest\\a");
        deleteDir(file);

    }

    public static void deleteDir(File path) {
        File[] files = path.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deleteDir(file);
            }
        }
        path.delete();
    }
}
