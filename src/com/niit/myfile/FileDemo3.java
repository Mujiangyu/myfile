package com.niit.myfile;

import javax.xml.crypto.Data;
import javax.xml.transform.Source;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) throws ParseException {
        File f = new File("E:\\FileTest\\a.txt");
        //length返回文件的大小，(字节)
        //只能获取文件的大小
        //无法获取文件夹的大小
        //如果要获取文件夹的大小，需要将文件夹中的所有文件的大小累加起来
        long length = f.length();
        System.out.println(length);

        File f2 = new File("E:\\FileTest\\b");
        long length1 = f2.length();
        System.out.println(length1);
        System.out.println("==================================");

        //返回文件的绝对路径
        File f3 = new File("FileDemo1");
        String path = f3.getAbsolutePath();
        System.out.println(path);
        System.out.println("==================================");

        //返回文件的定义时路径
        File f4 = new File("FileDemo1");
        String path1 = f4.getPath();
        System.out.println(path1);
        System.out.println("==================================");

        //获得文件的名字
        //如果调用者是一个文件，返回的是文件名+扩展名
        //如果调用者是一个文件夹，放回的就只有文件夹的名字
        File f5 = new File("FileDemo1");
        String name = f5.getName();
        System.out.println(name);
        System.out.println("==================================");

        //返回文件的最后修改时间
        File f6 = new File("E:\\FileTest\\a.txt");
        long time = f6.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String date = sdf.format(time);
        System.out.println(date);
    }
}
