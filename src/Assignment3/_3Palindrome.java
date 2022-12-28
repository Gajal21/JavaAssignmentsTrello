package Assignment3;

import java.util.Scanner;

public class _3Palindrome {
    public static void main(String[] args) {     //151
        System.out.println("Enter a number");
        int num=new Scanner(System.in).nextInt();
        int temp=num, rev=0;
        while(num!=0){
            int rem=num%10;
             rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("entered number is palindrome");
        }
        else{
            System.out.println("entered number is not palindrome");
        
        }
    }
}


