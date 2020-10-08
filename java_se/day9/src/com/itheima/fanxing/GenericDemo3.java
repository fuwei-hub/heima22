package com.itheima.fanxing;

public class GenericDemo3 {
    public static void main(String[] args) {

        //创建没有声明的实现类
        GenericImp01<Integer> g1 = new GenericImp01<>();
        g1.show(18);

        //创建String类型的实现类
        GenericImp02 g2 = new GenericImp02();
        g2.show("我是吴亦凡");

        //匿名内部类
        new GenericInt<Boolean>() {
            @Override
            public void show(Boolean aBoolean) {
                System.out.println(!aBoolean);
            }
        }.show(true);
        //Lambda表达式
        GenericInt<Integer> g3=(i)-> System.out.println(i);
        g3.show(288);
    }

    //泛型接口
    interface GenericInt<T> {
        void show(T t);
    }

    //实现类也不声明类型
    static class GenericImp01<T> implements GenericInt<T> {
        @Override
        public void show(T t) {
            System.out.println(t);
        }
    }

    //实现类声明类型为String
    static class GenericImp02 implements GenericInt<String> {
        @Override
        public void show(String s) {
            System.out.println(s);
        }
    }
}
 








