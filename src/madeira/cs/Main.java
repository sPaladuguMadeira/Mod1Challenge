package madeira.cs;

import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {

        //Problem I

        System.out.println("Saanvi Paladugu");

        System.out.println("Saanvi"); // FIXME: use print() to print your
        System.out.println("Paladugu");

        //Problem II

        String First = "Hello ";
        String Second = "World ";

        System.out.format(First); //FIXME: The \n character also works
        System.out.format(Second);

        //Problem III

        Scanner scan = new Scanner(System.in);

        System.out.format("Enter your age in years: ");
        String name = scan.nextLine();
        System.out.format(name); // FIXME: you need to use print & print the TYPE of the variable

        //Problem IV (My full name is Saanvi Paladugu)

        String firstName;
        String lastName;
        String result;

        // FIXME: the goal is to have the user GUESS your name
        // FIXME: You can compare your name to their guess with == or .equals() and print the result
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
        // +1 nice!
        System.out.print(" Enter your age: ");
        int myAge = scan.nextInt();
        int intResult = myAge + 5;
        System.out.println(intResult);


    }

}
