package cn.huishengzhou.factoryMethod;

public class Client {
    public static void main(String[] args) {
        // 1. 创建咖啡商店
        CoffeeStore coffeeStore = new CoffeeStore();

        // 2. 传入要生产咖啡的工厂 例如美式咖啡
        coffeeStore.setFactory(new AmericanCoffeeFactory());

        // 3. 生产咖啡
        Coffee coffee = coffeeStore.orderCoffee();

        // 4. 打印
        System.out.println(coffee.getName());

        // 拿铁咖啡同理
        coffeeStore.setFactory(new LatteCoffeeFactory());
        coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
