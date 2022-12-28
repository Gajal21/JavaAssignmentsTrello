package Assignment2;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
         System.out.println("Enter your percentage ");
        int percentage = new Scanner(System.in).nextInt();
        if (percentage >= 90) {
            System.out.println("A Grade");
        } else if (percentage >= 75 && percentage<90) {
            System.out.println("B Grade");
        } else if(percentage < 75 && percentage >= 60) {
            System.out.println("C Grade");
        }
    }
}
