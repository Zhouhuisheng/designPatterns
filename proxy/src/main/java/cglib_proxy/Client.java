package cglib_proxy;

/**
 * 。。。没听完，后面卡住了，用的方法jdk17会报错，只能用jdk8，换了jdk8还要改maven不然跑不了
 */
public class Client {
    public static void main(String[] args) {
        // 1. 获取代理工厂类对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 2. 获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        // 3. 调用代理对象中的sell方法卖票
        proxyObject.sell();
    }
}
