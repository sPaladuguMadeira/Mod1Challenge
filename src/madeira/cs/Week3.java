package madeira.cs;

import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {

        // Problem I

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number choice: ");
        int a = scan.nextInt();
        System.out.print("Enter your second number choice: ");
        int b = scan.nextInt();
        if(a > b){
            System.out.println("First");
        }
        else if(b > a){
            System.out.println("Second");
        }

        // Problem II

        System.out.format("Enter your favorite music genre: ");
        String musicGenre = scan.nextLine();
        System.out.format(musicGenre);
        if (musicGenre.equals("R&B")) {
            System.out.println("Same!");
        } else
            System.out.println(" is lame!");

        // Problem III

        int myNumber;
        myNumber = 17;
        System.out.print("Enter your guess: ");
        String guess = scan.nextLine();
        if(guess>myNumber) {
            System.out.println("You are the potrait of a life of bad choices.");
        } else if(guess<myNumber) {
            System.out.println("I'm not saying you're stupid, I'm just saying you attract bad luck.");
        } else {
            System.out.println("CONGRATULATIONS! YOU GUESS THE NUMBER CORRECTLY!");
        }

        // Problem IV

        for (int i = 0; i <= 6; i++) {
            System.out.println("*");
        }

        // Problem V

        for (int i = 1; i <= 4; i = 4/2;) {
            System.out.println("*");
    }

}