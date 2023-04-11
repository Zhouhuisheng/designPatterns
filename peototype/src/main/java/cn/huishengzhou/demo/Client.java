package cn.huishengzhou.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建一个原型对象
        RealizeType realizeType = new RealizeType();
        // 2. 调用clone()方法，克隆一个对象
        RealizeType clone = realizeType.clone();

        // 两个对象不是同一个
        System.out.println("原对象与克隆出来的对象是否是同一个对象：" + (realizeType == clone));    // false
    }
}
