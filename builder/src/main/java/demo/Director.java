package demo;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product createProduct() {
        builder.setWall();
        builder.setFloor();
        builder.setWindow();
        return builder.getProduct();
    }
}
