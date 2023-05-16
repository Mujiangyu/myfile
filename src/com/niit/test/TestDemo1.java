package com.niit.test;

import java.io.File;
import java.io.IOException;

public class TestDemo1 {
    public static void main(String[] args) throws IOException {
        //在当前模块下的aaa文件夹中创建一个a.txt的文件

        File file = new File("myfile");
        file.mkdir();

        File src = new File(file,"a.txt");
        boolean newFile = src.createNewFile();

        if(newFile){
            System.out.println("success");
        }else
            System.out.println("defeate");
    }
}
