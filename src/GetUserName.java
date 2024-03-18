import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fName = SafeInput.getNonZeroLenString(scan, "First Name ");
        String lName = SafeInput.getNonZeroLenString(scan, "Last Name ");

        System.out.println("");
        System.out.println("Name: " + fName + " " + lName);


    }
}
