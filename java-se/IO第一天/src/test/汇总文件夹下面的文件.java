package test;

import java.io.File;
import java.util.HashMap;

public class 汇总文件夹下面的文件 {
    public static void main(String[] args) {
        File file = new File("D:\\code\\BasicCode\\day1");
        HashMap<String, Integer> map = new HashMap<>();
        getCount(map, file);
        System.out.println(map);
    }

    private static void getCount(HashMap<String, Integer> map, File file) {
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()){
                    String name = file1.getName();
                    String[] split = name.split("\\.");
                    if(split.length==2){
                        String s = split[1];
                        if(map.containsKey(s)){
                            Integer integer = map.get(s);
                            integer++;
                            map.put(s,integer);
                        }
                        else{map.put(s,1);}
                    }
                }else{
                    getCount(map,file1);
                }
            }
        }
    }
}