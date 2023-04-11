package cn.huishengzhou.example;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Robot robot = new Robot();
        robot.setName("一号");
        // 2. 克隆原对象
        Robot clone = robot.clone();
        clone.setName("二号");
        // 3. 调用方法
        robot.serve();  // 一号机器人为您服务
        clone.serve();  // 二号机器人为您服务
    }
}
