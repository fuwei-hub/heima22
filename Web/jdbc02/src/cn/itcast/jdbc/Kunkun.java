package cn.itcast.jdbc;

public class Kunkun implements Caicai {
    @Override
    public void jump() {
        System.out.println("跳一支");
    }

    @Override
    public void sing() {
        System.out.println("唱一首");
    }

    @Override
    public void play(String name) {
        System.out.println("玩"+name);
    }
}
