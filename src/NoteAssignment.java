
import java.util.Scanner;

public class NoteAssignment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fullName = "";
        int sum;

        fullName = SafeInput.yourName(scan);

        System.out.println("Full Name: " + fullName);



        sum = SafeInput.twoNumbers(1, 6);
        System.out.println("");
        System.out.println("Sum: " + sum);

    }






}