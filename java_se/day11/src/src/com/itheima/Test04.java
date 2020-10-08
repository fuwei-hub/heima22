package src.com.itheima;

import java.util.List;
import java.util.stream.Stream;

//Stream流中间操作方法
/*
Stream<T> filter(Predicate predicate)用于对流中的数据进行过滤
Stream<T> limit(long maxSize)返回此流中的元素组成的流，截取前指定参数个数的数据
Stream<T> skip(long n)跳过指定参数个数的数据，返回由该流的剩余元素组成的流
static <T> Stream<T> concat(Stream a, Stream b)合并a和b两个流为一个流
Stream<T> distinct()返回由该流的不同元素（根据Object.equals(Object) ）组成的流
 */
public class Test04 {
    public static void main(String[] args) {
        List<String>name= List.of("张三,23","张无忌,25","李翠花,28","张二麻子,18","易烊千玺,88");
        //Stream<T> filter(Predicate predicate)用于对流中的数据进行过滤
        name.stream().filter(s->s.startsWith("易")).forEach(s-> System.out.println(s));
        System.out.println("----------------------------");
        name.stream().filter(s-> Integer.parseInt(s.split(",")[1]) <=25).forEach(s-> System.out.println(s));
        System.out.println("----------------------------");
        //Stream<T> limit(long maxSize)返回此流中的元素组成的流，截取前指定参数个数的数据
        name.stream().limit(4).forEach(s-> System.out.println(s));
        Stream<String> limit = name.stream().limit(3);
        System.out.println("----------------------------");
        //Stream<T> skip(long n)跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        name.stream().skip(3).forEach(s-> System.out.println(s));
        Stream<String> skip = name.stream().skip(1);
        System.out.println("----------------------------");
       // static <T> Stream<T> concat(Stream a, Stream b)合并a和b两个流为一个流
        Stream.concat(skip,limit).forEach(s-> System.out.println(s));
        //Stream<T> distinct()返回由该流的不同元素（根据Object.equals(Object) ）组成的流(去重复)


    }
}
