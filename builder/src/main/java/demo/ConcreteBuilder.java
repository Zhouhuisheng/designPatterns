package demo;

public class ConcreteBuilder implements Builder {
    Product product = new Product();
    @Override
    public Builder setWall() {
        product.setWall("白色墙壁");
        return this;
    }

    @Override
    public Builder setFloor() {
        product.setFloor("黑色屋顶");
        return this;
    }

    @Override
    public Builder setWindow() {
        product.setWindow("铝合金窗户");
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
