import domain.Student;
import enums.Gender;

public class 枚举演示 {
    public static void main(String[] args) {
        Student student = new Student("张三", 23, "太原", Gender.MAN.TYPE);
        System.out.println(student);
    }
}
