package cn.huishengzhou.abstractFactory;

public interface ProductFactory {
    // 生产电脑
    public ComputerProduct createComputer();
    // 生产手机
    public PhoneProduct createPhone();
}
