package com.niit.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDemo6 {
    public static void main(String[] args) {
        /*
        * 统计一个文件夹中各种类型文件的个数并打印输出
        *
        * */
        File file = new File("E:\\FileTest");
        HashMap<String, Integer> hm0 = countFile(file);
        System.out.println(hm0);
    }

    public static HashMap<String, Integer> countFile(File path){
        File[] files = path.listFiles();
        HashMap<String,Integer> hm = new HashMap<>();
        for (File file : files) {
            if(file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length>=2){
                    String endName = arr[arr.length-1];
                    if(!hm.containsKey(endName)){
                        hm.put(endName,1);
                    }else {
                        int num = hm.get(endName);
                        num++;
                        hm.put(endName,num);
                    }
                }
            }else {
                HashMap<String, Integer> sonMap = countFile(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if(hm.containsKey(key)){
                        hm.put(key,value+ hm.get(key));
                    }else{
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
