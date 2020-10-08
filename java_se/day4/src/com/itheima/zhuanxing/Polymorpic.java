package com.itheima.zhuanxing;

public class Polymorpic {
    public static void main(String[] args) {
        Fu f=new Zi();//向上转换
        f.chang();

        Zi z=(Zi)f;//向下转换
        z.tiap();
    }
}


class Fu {
    public void chang() {
        System.out.println("唱一首");
    }
}

class Zi extends Fu {
    @Override
    public void chang() {
        System.out.println("唱两首");

    }
    public  void tiap(){
        System.out.println("跳一支");
    }
}