package cn.huishengzhou.factoryMethod;


public class CoffeeStore {
    // 1. 创建工厂对象
    private CoffeeFactory factory;

    // 2. 设置工厂对象
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    // 3. 点咖啡
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addSugar();  // 加糖
        coffee.addMilk();   // 加奶
        // 返回咖啡
        return coffee;
    }
}
