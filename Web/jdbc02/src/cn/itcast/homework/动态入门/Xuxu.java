package cn.itcast.homework.动态入门;

public class Xuxu implements Caicai {
    @Override
    public void sing() {
        System.out.println("🐔你太美");
    }

    @Override
    public void jump() {
        System.out.println("蹦沙卡拉卡");
    }

    @Override
    public void rap(String name) {
        System.out.println("唱一首"+name);
    }
}
