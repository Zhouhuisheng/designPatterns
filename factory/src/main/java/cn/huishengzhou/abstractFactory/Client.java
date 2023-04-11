package cn.huishengzhou.abstractFactory;

public class Client {
    public static void main(String[] args) {
        // 1. 创建工厂 例如Apple工厂
        ProductFactory factory = new AppleFactory();
        // 2. 生产同一产品族的（品牌）产品 苹果手机和电脑
        PhoneProduct phone = factory.createPhone();
        ComputerProduct computer = factory.createComputer();
        // 3. 输出
        System.out.println("----苹果工厂生产----");
        System.out.println(phone.getPhoneName());
        System.out.println(computer.getComputerName());

        // 华为工厂同理 可以生产同一产品族的产品
        System.out.println("----华为工厂生产----");
        factory = new HUAWEIFactory();
        phone = factory.createPhone();
        computer = factory.createComputer();
        System.out.println(phone.getPhoneName());
        System.out.println(computer.getComputerName());
    }
}
