package Assignment2;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Enter your year");
        int year = new Scanner(System.in).nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
