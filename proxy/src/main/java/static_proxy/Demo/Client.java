package static_proxy.Demo;

public class Client {
    public static void main(String[] args) {
        // 1. 生成代理对象 以供客户端访问
        ProxyPoint proxyPoint = new ProxyPoint();
        // 2. 利用代理对象实现买票
        proxyPoint.sell();
    }
}
