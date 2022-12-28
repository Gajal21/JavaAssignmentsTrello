package Assignment2;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args)

    {

        System.out.println("Enter Dividend");
        int dividend = new Scanner(System.in).nextInt();
        System.out.println("Enter Divisor");
        int divisor = new Scanner(System.in).nextInt();
        int Quotient = dividend / divisor;
        int Remainder = dividend % divisor;
        System.out.println("Quotient: " + Quotient);
        System.out.println("Remainder " + Remainder);
    }
}
