package demo;

/**
 * 房子
 */
public class Product {
    private String wall;
    private String floor;
    private String window;

    public Product() {
    }

    public Product(String wall, String floor, String window) {
        this.wall = wall;
        this.floor = floor;
        this.window = window;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "Product{" +
                "wall='" + wall + '\'' +
                ", floor='" + floor + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
