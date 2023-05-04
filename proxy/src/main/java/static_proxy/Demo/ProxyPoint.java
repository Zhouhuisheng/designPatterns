package static_proxy.Demo;

/**
 *  代理类（Proxy）：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制、扩展真实主题的功能
 *  代售点，负责代售火车站的火车票
 */
public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取服务费");
        trainStation.sell();
    }
}
