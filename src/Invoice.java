import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> serviceList = new ArrayList<>();
    private double totalCost;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalCost = 0;
    }

    public void addService(Service service){
        serviceList.add(service);
        totalCost += service.price();
    }

    public void printInvoice(){
        System.out.println("------------------- ABCXYZ GARAGE SERVICES -------------------");
        System.out.println("Customer info - ");
        System.out.println("Customer Name - " + customer.name() +
                " | " + "Ph. Number - " + customer.ph_Number());
        System.out.println("Vehicle Information - ");
        System.out.println("Vehicle Make - " + customer.car().make() +
                " | " + "Vehicle Model - " + customer.car().model() +
                " | " + "Vehicle Plate Number - " + customer.car().plate());
        System.out.println("Services");
        System.out.println("Service \t\t Price");
        for(Service s : serviceList){
            System.out.println(s.name() + "\t\t₹" + s.price());
        }
        System.out.println("Total Amount - \t\t " + totalCost);
    }
}
