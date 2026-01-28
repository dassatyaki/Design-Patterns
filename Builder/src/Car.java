public class Car {
    private String engine;
    private String reg;
    private String color;

    private Car(Builder build)
    {
        this.engine = build.engine;
        this.reg = build.reg;
        this.color = build.color;
    }

    @Override
    public String toString()
    {
        return engine + "," + color + "," + reg;
    }

    public static class Builder{
        public Car build() {
            return new Car(this);
        }

        private String engine;
        private String reg;
        private String color;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setReg(String reg) {
            this.reg = reg;
            return this;
        }
    }
}
