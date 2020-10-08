package com.itheima.domain;
//泛型类
public class Generic<T,K>{
   private T t;
   private K k;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
   /* @Override
    public String toString() {
        return "Generic{" +
                "t=" + t +
                '}';
    }*/
}
