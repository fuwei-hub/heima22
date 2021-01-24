import annos.MyAnno;
@SuppressWarnings(value = "all")//这个取消所有错误⚠
public class 自定义注解的使用 {
    @MyAnno(hobby = {"吃","喝","玩","乐"})
    public static void main(String[] args) {

    }
    @MyAnno(hobby = "睡觉")//对于一维数组的注解,如果数组中只有一个元素,直接写就可以了
    public void shouw(){}
}
