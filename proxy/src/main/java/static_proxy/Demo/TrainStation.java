package static_proxy.Demo;

/**
 *  真实主题类（Real Subject）：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象
 *  火车站，可以售票，但是一般通过代理类（售票点进行售票）
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站出票！");
    }
}
