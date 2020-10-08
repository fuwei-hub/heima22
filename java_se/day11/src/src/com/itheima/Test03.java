package src.com.itheima;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Stream的开始方法
/*
- Collection体系集合使用默认方法stream()生成流， default Stream<E> stream()
- Map体系集合把Map转成Set集合，间接的生成流
- 数组通过Arrays中的静态方法stream生成流
- 同种数据类型的多个数据通过Stream接口的静态方法of(T... values)生成流
 */
public class Test03 {
    public static void main(String[] args) {
        //List使用Stream方法
        List<String> s1=List.of("张三","赵四","王五","张二麻子","易烊千玺");
        s1.stream().filter(name->name.length()==4).forEach(name-> System.out.println(name));
        System.out.println("---------------------------------");
        //Set使用Stream方法
        Set<Integer> s2=Set.of(18,28,66,54,46,36,57);
        s2.stream().filter(number->number<=50).forEach(number-> System.out.println(number));
        System.out.println("---------------------------------");
        //Map体系生成流
        Map<String,Integer> s3=Map.ofEntries(Map.entry("张三",23),Map.entry("赵四",24),
                Map.entry("王五",25),Map.entry("张二麻子",26));
        Set<String> strings = s3.keySet();
        strings.stream().forEach(s-> System.out.println(s));
        System.out.println("---------------------------------");
        Set<Map.Entry<String, Integer>> entries = s3.entrySet();
        entries.stream().filter(s->s.getKey().startsWith("张")).forEach(s-> System.out.println(s));
        System.out.println("---------------------------------");
        //数组通过Arrays中的静态方法Stream生成流
        int[]arr={11,22,33,44,55,66};
        Arrays.stream(arr).filter(s->s>=20).forEach(s-> System.out.println(s));
        System.out.println("---------------------------------");
        String[]brr={"张三","赵四","张二麻子","王五"};
        Arrays.stream(brr).filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
    }
}
