package cn.huishengzhou.staticFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
//        // 1. 获取简单工厂对象
//        StaticCoffeeFactory factory = new StaticCoffeeFactory();
//        // 2. 获取咖啡
//        Coffee coffee = null;
//        coffee = factory.createCoffee(type);

        // 调用静态工厂的方法 生产咖啡
        Coffee coffee = StaticCoffeeFactory.createCoffee(type);

        // 3. 加糖加奶
        coffee.addSugar();
        coffee.addMilk();

        // 4. 返回咖啡
        return coffee;
    }
}
