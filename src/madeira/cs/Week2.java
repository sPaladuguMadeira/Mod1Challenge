package madeira.cs;

import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {

        //Problem I

        System.out.println("Saanvi Paladugu");

        System.out.println("Saanvi");
        System.out.println("Paladugu");

        //Problem II

        String First = "Hello ";
        String Second = "World ";

        System.out.format(First);
        System.out.format(Second);

        //Problem III

        Scanner scan = new Scanner(System.in);

        System.out.format("Enter your age in years: ");
        String name = scan.nextLine();
        System.out.format(name);

        //Problem IV (My full name is Saanvi Paladugu)

        String firstName;
        String lastName;
        String result;

        firstName = " Saanvi";
        System.out.println(firstName+" is my first name.");

        lastName = "Paladugu";
        System.out.println(lastName+" is my last name.");

        //Problem V

            int i = 2;
            int x = 1;
            int j = 2;
            boolean b = false;
            b = j % x == i;
            System.out.print(b);


        // ==================
        // EXTRA CREDIT BELOW
        // ==================

        //Problem VI

        System.out.print(" Enter your age: ");
        int myAge = scan.nextInt();
        int intResult = myAge + 5;
        System.out.println(intResult);


    }

}


