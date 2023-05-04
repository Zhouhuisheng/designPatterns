package cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    // 重写这个方法 才能用回调函数
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行了");
        return null;
    }

    public TrainStation getProxyObject() {
        // 1. 创建Enhancer对象 类似JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 2. 设置Enhancer对象的的父类字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;

    }
}
