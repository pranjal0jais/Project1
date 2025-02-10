public class Car {
    private final String make;
    private final String model;
    private final String plate;

    public Car(String make, String model, String plate) {
        this.make = make;
        this.model = model;
        this.plate = plate;
    }

    public String make() {
        return make;
    }

    public String model() {
        return model;
    }

    public String plate() {
        return plate;
    }
}
