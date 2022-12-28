package Assignment2;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        int n=0;
        do{
            System.out.printf("Enter a number");
            int num=new Scanner(System.in).nextInt();


            if(num<0){
                System.out.printf("its over");
                break;
            }

            if(num>0){
                System.out.printf("good going");
                continue;
            }


            System.out.printf("Press 1for continue");
            n=new Scanner(System.in).nextInt();
        }
        while (n==1);
    }
}
