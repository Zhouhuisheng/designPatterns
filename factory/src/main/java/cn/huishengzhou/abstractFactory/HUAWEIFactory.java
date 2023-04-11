package cn.huishengzhou.abstractFactory;

public class HUAWEIFactory implements ProductFactory {
    @Override
    public ComputerProduct createComputer() {
        return new MateBook();
    }

    @Override
    public PhoneProduct createPhone() {
        return new Mate50();
    }
}
