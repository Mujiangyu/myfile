package com.niit.test;

import java.io.File;

public class TestDemo5 {
    public static void main(String[] args) {
        /*
        * 统计一个文件夹的大小
        * */
        File file = new File("E:\\");
        long length = getLength(file);
        System.out.println(length);
    }

    public static long getLength(File path){
        File[] files = path.listFiles();
        long count=0;
        if(files!=null){

            for (File file : files) {
                if(file.isFile()){
                    count += file.length();
                }else {
                    count += getLength(file);
                }
            }

        }
        return count;
    }
}
