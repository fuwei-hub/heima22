package com.itheima.task;
/*

定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。

定义测试类，在主方法中创建对象，直接给对象的属性赋值。

调用对象的两个功能，打印效果如下：

```
正在使用价格为3998元黑色的小米手机打电话....
正在使用价格为3998元黑色的小米手机发短信....
```

 */
public class Phone {
    String brand;
    int price;
    String color;

    public  void call(String dianhua) {
        System.out.println(dianhua);
    }
    public  void sendMessage(String duanxin) {
        System.out.println(duanxin);
    }
}
