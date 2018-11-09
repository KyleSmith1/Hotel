
/**
 * @author 14001835
 */
import java.util.Scanner;

public class Room {

    private String roomNos;
    private int roomNosInt;
    private int floorNos;
    private Customer occupier;
    private boolean status;
    private double cost = 100;

    public Room(String rnos, int fnos) {
        roomNos = rnos;
        floorNos = fnos;
        status = true; //free
    }

    public void display() {
        System.out.println("Room number: " + floorNos + roomNos);
        if (status == true) {
            System.out.println("Room is free");
        } else {
            occupier.display();
        }
    }

    public void displayAvailable() {
        if (status == true) {
            System.out.println("Room number: " + floorNos + roomNos);
        }
    }

    public void bookroom(Customer newperson) {
        if (status == true) {
            status = false;
            occupier = newperson;
        } else {
            System.out.println("Sorry room booked");
        }
    }

    public void bookroom() {
        System.out.println("Room " + floorNos + roomNos);
        if (status == true) {
            Scanner kboard = new Scanner(System.in);
            System.out.println("Which type of customer are you?");
            System.out.println("1. Regular Customer");
            System.out.println("2. Gold Customer");
            System.out.println("3. Employee Customer");
            String answer = kboard.nextLine();
            switch (answer) {

                case "1":
                    Customer newPerson = new OrdinaryCustomer();
                    occupier = newPerson;
                    newPerson.calcCost(cost);
                    break;

                case "2":
                    Customer newGoldPerson = new GoldCustomer();
                    occupier = newGoldPerson;
                    newGoldPerson.calcCost(cost);
                    break;

                case "3":
                    Customer newEmployeePerson = new EmployeeCustomer();
                    occupier = newEmployeePerson;
                    newEmployeePerson.calcCost(cost);
                    break;

                default:
                    System.out.println("Input not recognised");
                    break;

            }
            status = false;
        } else {
            System.out.println("Sorry room booked");
        }
    }

    public void cancelRoom() {
        status = true;
        occupier = null;
        System.out.println("Room cancelled");
    }

    public int returnRoomNos() {
        roomNosInt = Integer.parseInt(roomNos);
        return (roomNosInt);
    }

}
