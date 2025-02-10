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
        try{
        System.out.println("------------------- ABCXYZ GARAGE SERVICES -------------------");
        Thread.sleep(500);
        System.out.println("Customer info - ");
        Thread.sleep(500);
        System.out.println("Customer Name - " + customer.name() +
                " | " + "Ph. Number - " + customer.ph_Number());
        Thread.sleep(500);
        System.out.println("Vehicle Information - ");
        Thread.sleep(500);
        System.out.println("Vehicle Make - " + customer.car().make() +
                " | " + "Vehicle Model - " + customer.car().model() +
                " | " + "Vehicle Plate Number - " + customer.car().plate());
        Thread.sleep(500);
        System.out.println("Services - ");
        Thread.sleep(500);
        System.out.println("Service \t\t Price");
        for(Service s : serviceList){
            System.out.println(s.name() + "\t₹" + s.price());
            Thread.sleep(250);
        }
        Thread.sleep(500);
        System.out.println("Total Amount - \t " + totalCost);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
