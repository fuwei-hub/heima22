package com.itheima.shangpu;
/*
商品名称  商品编号   商家     价格    型号
 */
public class Shoop {
    String name;
    int bianhao;
    double price;
    int xinghao;
    boolean  zhenjia;

    public Shoop() {
    }

    public Shoop(String name, int bianhao, double price, int xinghao, boolean zhenjia) {
        this.name = name;
        this.bianhao = bianhao;
        this.price = price;
        this.xinghao = xinghao;
        this.zhenjia = zhenjia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBianhao() {
        return bianhao;
    }

    public void setBianhao(int bianhao) {
        this.bianhao = bianhao;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getXinghao() {
        return xinghao;
    }

    public void setXinghao(int xinghao) {
        this.xinghao = xinghao;
    }

    public boolean isZhenjia() {
        return zhenjia;
    }

    public void setZhenjia(boolean zhenjia) {
        this.zhenjia = zhenjia;
    }

    @Override
    public String toString() {
        return "shoop{" +
                "name='" + name + '\'' +
                ", bianhao=" + bianhao +
                ", price=" + price +
                ", xinghao=" + xinghao +
                ", zhenjia=" + zhenjia +
                '}';
    }

    public  void kaiye(String m) {
        System.out.println(m);

    }
}
