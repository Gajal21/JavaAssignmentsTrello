package Assignment3;

import java.util.Scanner;

public class _2Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number for factorial");
        int num=new Scanner(System.in).nextInt();
        System.out.println("Factorial of a "+ num+" is:"+fact(num));

    }
    static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*fact(num-1);
    }
}
