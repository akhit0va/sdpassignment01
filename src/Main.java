public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2024)
                .setEngine("Hybrid")
                .setGps(true)
                .build();

        System.out.println(car);
    }
}
