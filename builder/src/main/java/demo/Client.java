package demo;

public class Client {
    public static void main(String[] args) {
        // 1. 创建指挥者
        Director director = new Director(new ConcreteBuilder());

        // 2. build产品
        Product product = director.createProduct();

        // 3. 输出产品
        System.out.println(product.toString());
    }
}
