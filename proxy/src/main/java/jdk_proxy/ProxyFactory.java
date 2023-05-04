package jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private TrainStation trainStation = new TrainStation();
    // 获取代理类对象
    public SellTickets getProxyObject() {
        /**
         * newProxyInstance(ClassLoader loader, 类加载器，用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces, 代理类实现的接口的字节码对象
         * InvocationHandler h). 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets)Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * Object proxy, 代理对象，和proxyObject是同一个对象，在哪invoke()方法中基本不用
                     * Method method, 对接口中的方法进行封装的Method对象
                     * Object[] args, 调用方法的实际参数
                     *
                     * return: 方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取服务费（jdk动态代理）");

                        // 执行目标对象的方法
                        Object obj = method.invoke(trainStation, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
