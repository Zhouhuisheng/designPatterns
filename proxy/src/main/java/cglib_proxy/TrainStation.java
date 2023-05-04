package cglib_proxy;

/**
 *  真实主题类（Real Subject）：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象
 *  火车站，可以售票，无接口用CGLIB实现动态代理
 */
public class TrainStation {
    public void sell() {
        System.out.println("火车站出票！");
    }
}
