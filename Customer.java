
/**
 * @author 14001835
 */
import java.util.Scanner;

public abstract class Customer {

    protected String customerName;
    protected String customerEmail;

    abstract public void display();

    abstract public String getName();

    abstract public String getEmail();

    abstract public void calcCost(double cost);

}
