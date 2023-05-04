package jdk_proxy;

public class Client {
    public static void main(String[] args) {
        // 1. 创建代理对象工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        // 2. 获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        // 3. 利用代理对象实现买票
        proxyObject.sell();

        //
        System.out.println(proxyObject.getClass());
        while(true) {}
    }
}
