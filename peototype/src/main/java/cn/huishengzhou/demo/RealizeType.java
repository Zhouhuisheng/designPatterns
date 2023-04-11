package cn.huishengzhou.demo;

public class RealizeType implements Cloneable {
    public RealizeType() {
        System.out.println("具体的原型对象成功创建！");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型对象复制成功！");
        return (RealizeType)super.clone();
    }
}
