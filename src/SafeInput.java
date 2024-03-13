import java.util.Scanner;

public class SafeInput {

    public static String yourName(Scanner pipe){
        String fname = "";
        String lname = "";

        System.out.println("First Name: ");
        fname = pipe.nextLine();

        System.out.println("Last Name: ");
        lname = pipe.nextLine();

        return fname + " " + lname;
    }

    public static int twoNumbers(int a, int b){

        int c = 0;

        c = a + b;

        return c;
    }


    public static void prettyHeader(String msg) {

        int totalSpaces = 60 - 6 - msg.length();
        int leftSpace;
        int rightSpace;

        if (totalSpaces % 2 == 0){
            leftSpace = rightSpace = totalSpaces / 2;
        }
        else{
            rightSpace = totalSpaces / 2;
            leftSpace = rightSpace + 1;
        }


        //Print Top Border
        for(int i = 0; i <= 60; i++){

            System.out.print("*");

        }
        System.out.println("");
        //First 3 *s
        System.out.print("***");
        //LeftSpaces
        for(int i = 0; i <= leftSpace; i++){
            System.out.print(" ");
        }
        //Print Message
        System.out.print(msg);
        //RightSpaces
        for(int i = 0; i <= rightSpace; i++){
            System.out.print(" ");
        }
        //Last 3 *s
        System.out.print("***");
        System.out.println("");

        //Bottom Border
        for(int i = 0; i <= 60; i++){

            System.out.print("*");

        }

       return;
    }






}




