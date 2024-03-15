import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int favint = SafeInput.getInt(scan, "Favorite Int: ");
        double favdouble = SafeInput.getDouble(scan, "Favorite Double: ");

        System.out.println("");
        System.out.println("Your Favorite Int: " + favint);
        System.out.println("Your Favorite Double: " + favdouble);


    }
}


