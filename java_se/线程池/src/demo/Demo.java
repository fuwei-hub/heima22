package demo;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

//练习CopyOnWirteArraySet 此对象是有序的(就是说代码是什么顺序,打印出来就是什么顺序)
public class Demo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> strings = new CopyOnWriteArraySet<>();
        strings.add("🐔");
        strings.add("3你");
        strings.add("2太");
        strings.add("1美");
        for (String string : strings) {
            System.out.println(string);
        }

        //hashset无序
        HashSet<String> strings1 = new HashSet<>();
        strings1.add("1");
        strings1.add("3");
        strings1.add("5");
        strings1.add("4");
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}
