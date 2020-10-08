package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Comparator;

public class 将字符串中的数字排序后放入 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("IO02\\b.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO02\\b.txt.bak"));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        Arrays.sort(s1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        for (String s2 : s1) {
            bw.write(s2 + " ");
        }
        br.close();
        bw.close();
    }
}
