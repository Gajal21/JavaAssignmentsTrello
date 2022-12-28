package Assignment3;

import java.util.Scanner;

public class _1Fibonacci{
    public static void main(String[] args) {
        
   System.out.println("Enter the n number if series starts from 0th term");
   int n=new Scanner(System.in).nextInt();
   //0 th term -> 0
   // 1th term -> 1
   // 2th term -> 1
   // 3th term -> 2
   // 4 th term ->3 
   //5 th term ->5
   //6th term ->8
   //7th term ->13
int a=0,b=1;
System.out.print(a+", "+b+", ");
for(int i=2;i<n;i++){
    int c=a+b;
    System.out.print(c+", ");
    a=b;
    b=c;


}

    }
}  