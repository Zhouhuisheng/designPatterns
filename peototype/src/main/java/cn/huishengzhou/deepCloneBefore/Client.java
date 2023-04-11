package cn.huishengzhou.deepCloneBefore;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Robot robot = new Robot();
        // 2. 赋值信息
        Info info = new Info();
        robot.setInfo(info);
        robot.setStr("一号");

        // 3. clone()
        Robot clone = robot.clone();
        // 4. 修改克隆对象的信息
        clone.setStr("二号");

        // 打印两个对象的信息 都是二号 因为是浅拷贝，所以引用类型的属性都是同一个地址，需要用深克隆解决此问题
        System.out.println(robot.getStr()); // 二号
        System.out.println(clone.getStr()); // 二号
    }
}
