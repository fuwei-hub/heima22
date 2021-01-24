package demo;

import com.sun.security.jgss.GSSUtil;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//练习CopyOnWriteArrayList
public class Demo05 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        strings.add("唱");
        strings.add("跳");
        strings.add("rap");
        strings.add("🏀");
        //第一种遍历
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        //第二种遍历
        for (String string : strings) {
            System.out.println(string);
        }
        //第三种遍历
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
