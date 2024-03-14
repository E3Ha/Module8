import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String prompt = SafeInput.getNonZeroLenString(scan, "Name");
        SafeInput.prettyHeader(prompt);


    }
}
