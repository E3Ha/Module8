import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int day = 0;

        int year = SafeInput.getRangedInt(scan, "Year: ", 1950, 2010);
        int month = SafeInput.getRangedInt(scan, "Month: ", 1, 12);
        //use a switch to determine range allowed for days based on months
        switch (month){
            case 2:
                //1-29
                day = SafeInput.getRangedInt(scan, "Days: ", 1, 29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                //1-30
                day = SafeInput.getRangedInt(scan, "Days: ", 1, 30);
                break;
            default:
                //1-31
                day = SafeInput.getRangedInt(scan, "Days: ", 1, 31);
                break;

        }
        int hours = SafeInput.getRangedInt(scan, "Hours: ", 1, 24);
        int minutes = SafeInput.getRangedInt(scan, "Minutes: ", 1, 59);



    }
}
