package src.com.itheima.treesettest;
//学生类   姓名,,语文成绩,数学成绩,英语成绩
public class Student implements Comparable<Student> {
    String name;
    int chinese;
    int math;
    int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名:'" + name + '\'' +
                ", 语文:" + chinese +
                ", 数学:" + math +
                ", 英语:" + english +
                '}'+"总分为:"+getSum();
    }

    public  int getSum() {
        return chinese+english+math;
    }

    @Override
    public int compareTo(Student o) {
        int result=this.getSum()-o.getSum();
        result = result == 0 ? this.getChinese() - o.getChinese() : result;
        result = result == 0 ? this.getMath() - o.getMath() : result;
        return -result;

    }
}
