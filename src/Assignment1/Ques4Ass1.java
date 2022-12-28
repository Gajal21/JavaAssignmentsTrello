package Assignment1;

import java.util.Scanner;

public class Ques4Ass1 {
    public static void main(String[] args) {
        //WAP to add two numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int first=sc.nextInt();
        System.out.println("Enter second number");
        int second=sc.nextInt();
        int ans=first+second;
        System.out.println("The addition of first and second is: "+ ans);
    }
}
