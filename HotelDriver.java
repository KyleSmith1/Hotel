
import java.util.Scanner;

/**
 * @author 14001835
 */
public class HotelDriver {

    public static void main(String[] args) {

        Hotel h1 = new Hotel(101, "The Grand");
        String choice;
        Scanner kboard = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            choice = kboard.nextLine();
            switch (choice) {
                case "1":
                    h1.display();
                    break;
                case "2":
                    h1.display();
                    h1.bookARoom();
                    break;
                case "3":
                    h1.display();
                    h1.CancelARoom();
                    break;
                case "4":
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input not valid");
                    break;
            }

        }

    }

}
