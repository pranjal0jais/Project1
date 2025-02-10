import java.util.Scanner;

public class GarageBillingApp {

    public static void printMenu(){
        System.out.println("------------------- ABCXYZ GARAGE SERVICES -------------------");
        System.out.println("1. Add Customer");
        System.out.println("2. Create Bill");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);

        while(true){
            printMenu();
            System.out.println("Enter your choice - ");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Add Customer Detail");

                    System.out.print("Customer Name - ");
                    String customerName = sc.next();
                    sc.nextLine();
                    System.out.print("Customer Phone Number - ");
                    String customerPhNumber = sc.next();
                    sc.nextLine();

                    System.out.println("Car Detail ");

                    System.out.print("Car Make - ");
                    String carMake = sc.nextLine();

                    System.out.print("Car Model - ");
                    String carModel = sc.nextLine();

                    System.out.print("Car Plate Number - ");
                    String carPlateNo = sc.next();
                    sc.nextLine();

                    garageService.addCustomer(customerName, customerPhNumber, carMake, carModel, carPlateNo);

                    break;
                case 2:
                    System.out.println("Enter Customer's Phone Number - ");
                    garageService.generateInvoice(sc.next());
                    break;
                case 3:
                    System.out.println("Thank You For Using.");
                    return;
                default:
                    System.out.println("Enter valid choice.");
                    break;
            }
        }
    }


}
