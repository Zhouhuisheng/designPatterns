package extendBefore;

public class Computer {
    private String cpu;
    private String memory;
    private String screen;
    private String keyboard;

    // 比较长 容易出错
    public Computer(String cpu, String memory, String screen, String keyboard) {
        this.cpu = cpu;
        this.memory = memory;
        this.screen = screen;
        this.keyboard = keyboard;
    }
}
