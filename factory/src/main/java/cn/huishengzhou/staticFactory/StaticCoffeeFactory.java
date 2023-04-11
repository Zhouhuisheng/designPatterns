package cn.huishengzhou.staticFactory;

public class StaticCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;

        if (type == "美式咖啡") {
            coffee = new AmericanCoffee();
        } else if (type == "拿铁咖啡") {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("输入错误，工厂中没有此咖啡");
        }

        return coffee;
    }
}
