public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String engine;
    private final boolean gps;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.engine = builder.engine;
        this.gps = builder.gps;
    }

    @Override
    public String toString() {
        return String.format(
                "Car [Brand=%s, Model=%s, Year=%d, Engine=%s, GPS=%b]",
                brand, model, year, engine, gps
        );
    }

    // Вложенный класс Builder
    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private String engine;
        private boolean gps;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setGps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
