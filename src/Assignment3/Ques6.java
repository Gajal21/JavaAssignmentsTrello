package Assignment3;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        int n=0;
        do{
            System.out.println("Please enter two numbers number");
            int num1=new Scanner(System.in).nextInt();
            int num2=new Scanner(System.in).nextInt();
            int sum=num1+num2;
            System.out.println("The addition is: "+sum);
            System.out.println("Press 1 for continue");
            n=new Scanner(System.in).nextInt();
        }
        while(n==1);
    }
}
