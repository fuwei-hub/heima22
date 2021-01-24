package test.test02;

public class 测试类 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三", 18, "加拿大", Gender.MAN.TYPE);
        Teacher teacher1 = new Teacher("小花", 19, "新加坡", Gender.WOMAN.TYPE);
        System.out.println(teacher);
        System.out.println(teacher1);
    }
}
