package cn.huishengzhou.simpleFactory;

public class Client {
    public static void main(String[] args) {
        // 1. 创建咖啡商店对象
        CoffeeStore coffeeStore = new CoffeeStore();

        // 2. 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("拿铁咖啡");

        // 3. 输出咖啡名字
        System.out.println(coffee.getName());
    }
}
