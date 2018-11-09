
import java.util.Scanner;

/**
 * @author 14001835
 */
public class GoldCustomer extends Customer {

    private double discount = 0;
    private final double discountPercentage = 0.2;
    private double roomCost = 0;

    public GoldCustomer() {
        customerName = this.getName();
        customerEmail = this.getEmail();
    }

    public void display() {
        System.out.println("Details are " + customerName + " " + customerEmail);
    }

    public String getName() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your name");
        customerName = kboard.nextLine();
        return customerName;
    }

    public String getEmail() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your contact details");
        customerEmail = kboard.nextLine();
        return customerEmail;
    }

    public void calcCost(double cost) {
        discount = cost * discountPercentage;
        roomCost = cost - discount;
        System.out.println("The cost of the room is: " + roomCost );
    }

}
