package cn.huishengzhou.deepCloneAfter;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. 创建原型对象
        Robot robot = new Robot();
        // 2. 赋值信息
        Info info = new Info();
        robot.setInfo(info);
        robot.setStr("一号");

        // 3. 实现序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./serialization.txt"));
        oos.writeObject(robot); // 序列化
        oos.close();

        // 4. 实现反序列化 使得所有引用类型的属性不是原来的地址，从而实现深克隆
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./serialization.txt"));
        Robot clone = (Robot)ois.readObject();  // 反序列化
        ois.close();

        // 5. 改变深克隆对象的引用属性
        clone.setStr("二号");

        // 打印两个对象的信息 结果不同，因为实现了深拷贝，指向的不是同一个地址
        System.out.println(robot.getStr()); // 二号
        System.out.println(clone.getStr()); // 一号
    }
}
