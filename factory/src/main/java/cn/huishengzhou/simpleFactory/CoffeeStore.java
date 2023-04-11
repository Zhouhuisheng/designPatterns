package cn.huishengzhou.simpleFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 1. 获取简单工厂对象
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        // 2. 获取咖啡
        Coffee coffee = null;
        coffee = factory.createCoffee(type);

        // 3. 加糖加奶
        coffee.addSugar();
        coffee.addMilk();

        // 4. 返回咖啡
        return coffee;
    }
}
