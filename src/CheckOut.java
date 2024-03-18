import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        boolean done = true;

        do {
            double price = SafeInput.getRangedDouble(scan, "Item Price: ", 0, 10);
            totalPrice = totalPrice + price;
            done = SafeInput.getYNConfirm(scan, "Continue?");
        }
        while (done == false);

        System.out.println("Total: " + totalPrice);

    }
}
