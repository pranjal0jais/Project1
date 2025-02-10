import java.util.*;

public class GarageService {
    private Map<String, Customer> customerMap;
    private List<Service> availableService;


    public GarageService(){
        customerMap = new HashMap<>();
        availableService = new ArrayList<>();
        loadServices();
    }

    private void loadServices(){
        availableService.add(new Service("Oil Change", 1000));
        availableService.add(new Service("Car Wash & Wax", 500));
        availableService.add(new Service("Wheel Alignment & Balancing", 800));
        availableService.add(new Service("AC Servicing", 1500));
        availableService.add(new Service("Battery Replacement", 2000));
        availableService.add(new Service("Brake Pad Replacement", 2500));
        availableService.add(new Service("Clutch Replacement", 7000));
        availableService.add(new Service("Engine Diagnostics", 2000));
        availableService.add(new Service("Suspension Repair", 5000));
        availableService.add(new Service("Tire Replacement", 3000));
    }

    public void addCustomer(String name, String phNumber, String carMake, String carModel, String carPlate){
        Car car = new Car(carMake, carModel, carPlate);
        Customer customer = new Customer(name, phNumber, car);
        customerMap.put(phNumber, customer);
        System.out.println("Customer Added Successfully");
    }

    public void generateInvoice(String phoneNumber){
        if(!customerMap.containsKey(phoneNumber)){
            System.out.println("Customer's Car with Plate number " + phoneNumber + " do not exist");
            return;
        }
        Scanner sc = new Scanner(System.in);
        Invoice invoice = new Invoice(customerMap.get(phoneNumber));
        while(true){
            System.out.println("Choose Services (0 to generate the final bill)- ");
            for (int i = 0; i < availableService.size(); i++) {
                System.out.println(i+1 + ". " + availableService.get(i).name());
            }
            System.out.println("Enter your choice - ");
            int choice = sc.nextInt();
            if(choice == 0) break;
            if(choice >= 1 && choice <= availableService.size()){
                invoice.addService(availableService.get(choice - 1));
                System.out.println("Service Added.");
            } else {
                System.out.println("Invalid Choice.");
            }
        }
        invoice.printInvoice();
    }

    public void viewAllCustomers(){
            System.out.println("------------------- CUSTOMER LIST -------------------");
            if(customerMap.isEmpty()) System.out.println("Customer List is Empty");
        for(String key : customerMap.keySet()){
            System.out.println("NAME - " + customerMap.get(key).name());
            System.out.println("PHONE NUMBER - " + customerMap.get(key).ph_Number());
            System.out.println("CAR MAKE - " + customerMap.get(key).car().make());
            System.out.println("CAR MODEL - " + customerMap.get(key).car().model());
            System.out.println("CAR PLATE NUMBER - " + customerMap.get(key).car().plate());
            System.out.println("-----------------------------------------------------------");
        }
    }
}
