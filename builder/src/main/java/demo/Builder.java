package demo;

public interface Builder {
    public Builder setWall();       // 墙壁
    public Builder setFloor();      // 屋顶
    public Builder setWindow();     // 窗
    public Product getProduct();    // 生产产品

}
