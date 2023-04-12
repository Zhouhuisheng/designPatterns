package extendAfter;
public class Client {
    public static void main(String[] args) {
        // 可以实现链式编程
        Computer computer = new Computer.Builder()
                .setCpu("i7")
                .setMemory("8G")
                .setScreen("三星")
                .setKeyboard("罗技")
                .build();

        System.out.println(computer);
    }
}
