package Assignment3;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int n=0;
        do{
            System.out.println("Please enter number");
            int num=new Scanner(System.in).nextInt();
            smallest=Math.min(smallest,num);
            largest=Math.max(largest, num);

            System.out.println("Press 1 for continue");
            n=new Scanner(System.in).nextInt();
        }
        while(n==1);
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
    }
}
