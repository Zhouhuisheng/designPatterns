package cn.huishengzhou.abstractFactory;

/**
 *  Apple工厂 能生产MacBook和IPhone
 */
public class AppleFactory implements ProductFactory {
    @Override
    public ComputerProduct createComputer() {
        return new MacBook();
    }

    @Override
    public PhoneProduct createPhone() {
        return new IPhone();
    }
}
