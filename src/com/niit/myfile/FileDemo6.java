package com.niit.myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo6 {
    public static void main(String[] args) {
        //列出可用的文件系统根，即获取系统中方所有的盘符
      /*  File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        //list()    获取当前路径下的所有内容
        File file = new File("E:\\FileTest\\a");
        String[] arr1 = file.list();
        for (String s : arr1) {
            System.out.println(s);
        }*/

        //利用文件名过滤器获取当前文件夹下的指定内容
        //例如，只获取文件夹中的.txt文本文件
        File f = new File("E:\\FileTest\\a");
        String[] list = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(list));
    }
}
