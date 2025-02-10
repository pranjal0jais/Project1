public class Customer {
    private String name;
    private String ph_Number;
    private Car car;

    public Customer(String name, String ph_Number, Car car) {
        name = name;
        ph_Number = ph_Number;
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
