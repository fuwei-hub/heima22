package com.itheima.qiche;

/*
汽车类
成员变量：汽车名（String）、价格（price）、原产地（String）、能否贷款（boolean）
 */
public class Car {
    private String name;
    private double price;
    private String chandi;
    private boolean daikuan;
//定义空参的格式方法
    public Car() {
    }
//设置全参的格式办法
    public Car(String name, double price, String chandi, boolean daikuan) {
        this.name = name;
        this.price = price;
        this.chandi = chandi;
        this.daikuan = daikuan;
    }
//设置get、set办法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getChandi() {
        return chandi;
    }

    public void setChandi(String chandi) {
        this.chandi = chandi;
    }

    public boolean isDaikuan() {
        return daikuan;
    }

    public void setDaikuan(boolean daikuan) {
        this.daikuan = daikuan;
    }
    //设置特定的成员方法
    public void start(){
        System.out.println("汽车启动");
    }
    public void end(){
        System.out.println("汽车熄火");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", chandi='" + chandi + '\'' +
                ", daikuan=" + daikuan +
                '}';
    }
}
