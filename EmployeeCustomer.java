
import java.util.Scanner;

/**
 * @author 14001835
 */
public class EmployeeCustomer extends Customer {
    
    private double roomCost = 0;

    public EmployeeCustomer() {
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
        System.out.println("Please enter your employee number");
        customerEmail = "Employee: " + kboard.nextLine();
        return customerEmail;
    }

    public void calcCost(double cost) {
        System.out.println("The cost of the room is: " + roomCost );
    }

}
