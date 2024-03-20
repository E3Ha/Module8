import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        //Test cases
        String ssn = "\\d{3}-\\d{2}-\\d{4}";
        String uc = "(M|m)\\d{5}";
        String menu = "[OoSsVvQq]";


        Scanner scan = new Scanner(System.in);
        System.out.println(SafeInput.getRegExString(scan,"Social Security #: ", ssn));
        System.out.println(SafeInput.getRegExString(scan,"UC #: ", uc));
        System.out.println(SafeInput.getRegExString(scan,"Menu Option: ", menu));



    }
}

