public class Customer {
    private final String name;
    private final String ph_Number;
    private final Car car;

    public Customer(String name, String ph_Number, Car car) {
        this.name = name;
        this.ph_Number = ph_Number;
        this.car = car;
    }

    public String name() {
        return name;
    }

    public String ph_Number() {
        return ph_Number;
    }

    public Car car() {
        return car;
    }
}
