package cn.huishengzhou.example;

public class Robot implements Cloneable {
    private String name;

    public Robot() {
    }

    public Robot(String name) {
        this.name = name;
    }

    public void serve() {
        System.out.println(name + "机器人为您服务");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Robot clone() throws CloneNotSupportedException {
        return (Robot) super.clone();
    }
}
