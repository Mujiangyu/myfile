package com.niit.myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        //创建新的文件
        //如果当前路径表示的路径是存在的，则创建失败，返回false
    /*    File f = new File("E:\\Filetest\\b.txt");
        System.out.println(f.createNewFile());
        //如果父级路径不存在，方法会报错，IOException
        //CreateNewFile创建的一定是一个文件，如果不加后缀名，就会创建一个没有后缀名的文件
        File f1 = new File("D:\\a\\b\\c.txt");//系统找不到指定的路径
        System.out.println(f1.createNewFile());*/

        //创建一个文件夹
        //创建的文件夹路径必须是唯一的，否则会报错
        //mkdir只能创建单极文件夹，无法创建多级文件夹
       /* File f2 = new File("E:\\FileTest\\c");
        boolean m = f2.mkdir();
        System.out.println(m);*/
        //要创建多级文件夹，需要使用mkdirs方法，既可以创建单极文件夹，也可以创建多级文件夹
        File f3 = new File("E:\\FileTest\\a\\aa");
        boolean mk = f3.mkdirs();
        System.out.println(mk);

        //删除文件、文件夹
        //若果删除的是文件，则直接删除，并不会将其放到回收站中，是彻底的删除
        //如果删除的是文件夹，如是空文件夹，直接删除，如果是有内容的文件夹，则无法删除
    /*    File f = new File("E:\\FileTest\\a.txt");
        boolean delete = f.delete();
        System.out.println(delete);*/
        File f = new File("E:\\FileTest\\b");
        boolean delete = f.delete();
        System.out.println(delete);

    }
}
