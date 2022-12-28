package Assignment2;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        System.out.println("Enter the input amount");
        int amount = new Scanner(System.in).nextInt();
        double taxpaid = 0;
        if (amount < 250000) {
            taxpaid = 0;

        }

        else if (amount >= 250000 && amount < 600000) {
            taxpaid = 0.1 * amount;

        } else if (amount >= 600000 && amount < 1200000) {
            taxpaid = 0.18 * amount;
        } else {
            taxpaid = 0.25 * amount;
        }
        System.out.println("The tax paid is  " + taxpaid);
    }
}
