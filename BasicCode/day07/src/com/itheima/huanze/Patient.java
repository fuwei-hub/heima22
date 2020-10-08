package com.itheima.huanze;
/*
患者  Patient   姓名  性别   出生年月    病情
 */
public class Patient {
    String name;
    String xingbie;
    int chushengnianyue;
    String bingqing;

    public Patient() {
    }

    public Patient(String name, String xingbie, int chushengnianyue, String bingqing) {
        this.name = name;
        this.xingbie = xingbie;
        this.chushengnianyue = chushengnianyue;
        this.bingqing = bingqing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public int getChushengnianyue() {
        return chushengnianyue;
    }

    public void setChushengnianyue(int chushengnianyue) {
        this.chushengnianyue = chushengnianyue;
    }

    public String getBingqing() {
        return bingqing;
    }

    public void setBingqing(String bingqing) {
        this.bingqing = bingqing;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", chushengnianyue=" + chushengnianyue +
                ", bingqing='" + bingqing + '\'' +
                '}';
    }

    public void zhuyuan(String zhuyuan){
        System.out.println(zhuyuan);

    }
}
