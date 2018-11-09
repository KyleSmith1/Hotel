
/**
 * @author 14001835
 */
import java.util.Scanner;

public class Hotel {

    private int hotelnumber;
    private String hotelname;
    private Floor floors[] = new Floor[4];

    public Hotel(int nos, String name) {
        hotelnumber = nos;
        hotelname = name;
        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Floor f3 = new Floor(3);
        Floor f4 = new Floor(4);
        floors[0] = f1;
        floors[1] = f2;
        floors[2] = f3;
        floors[3] = f4;

    }

    public void display() {
        System.out.println("Hotel Name: " + hotelname);
        for (int counter = 0; counter < floors.length; counter++) {
            floors[counter].displayFloor();
        }
    }

    public void display(int floornos) {
        System.out.println("Hotel Name: " + hotelname);
        floors[floornos].displayFloor();
    }

    public void bookARoom() {
        Scanner kboard = new Scanner(System.in);
        int floorchoice;
        System.out.println("Which floor would you like to stay on?");
        floorchoice = kboard.nextInt();
        floors[floorchoice - 1].findaRoomtoBook();
    }

    public void CancelARoom() {
        Scanner kboard = new Scanner(System.in);
        int floorchoice;
        System.out.println("Which floor are you staying stay on?");
        floorchoice = kboard.nextInt();
        floors[floorchoice - 1].findaRoomtoCancel();
    }

}
