package com.itheima.task;

//测试手机类
public class TaskPhone {
    public static void main(String[] args) {
        Phone m = new Phone();
        m.brand = "小米";
        m.color = "黑色";
        m.price = 3988;
        m.call("正在使用价格为" + m.price + "元" + m.color + m.brand + "打电话");
        m.sendMessage("正在使用价格为" + m.price + "元" + m.color + m.brand + "发短信");
    }
}

