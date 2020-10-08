package com.itheima.domain;
//将数组中学生的数据放到学生数组中
public class TestStudent {
    public static void main(String[] args) {
        String aar="王，23；刘，14；名,25";
        String[] split = aar.split("；");
        Student[]stu=new Student[split.length];
        for (int i = 0; i < split.length; i++) {
            //split[i]
            String[] split1 = split[i].split("，");
            Student student = new Student();
            student.setName(split1[0]);
            student.setAge(split1[1]);
            stu[i]=student;
            System.out.println(stu[i]);
        }
    }
}
//没写完