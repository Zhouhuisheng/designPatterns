package extendAfter;

public class Computer {
    private String cpu;
    private String memory;
    private String screen;
    private String keyboard;

    // 构造器私有化 不使用构造器创建对象
    private Computer(Builder builder) {
        cpu = builder.cpu;
        memory = builder.memory;
        screen = builder.screen;
        keyboard = builder.keyboard;
    }

    public static final class Builder {
        private String cpu;
        private String memory;
        private String screen;
        private String keyboard;
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
