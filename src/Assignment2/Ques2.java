package Assignment2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("Enter your character");
        char ch = new Scanner(System.in).next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an alphabet.");
        else
            System.out.println(ch + " is not an alphabet.");
    }
}
