package Assignment7;

import java.util.Scanner;

public class Ques5 {
    static int order (int x)
    {
        int len=0;
        while (x!=0 )
        {
            len++;
            x=x/10;
        }
        return len;
    }

    static boolean isArmstrong (int num, int len)
    {

        int sum=0,temp,rem;
        temp=num;


        while (temp != 0)
        {
            rem=temp%10;
            sum=sum+(int)Math.pow(rem, len);
            temp=temp/10;
        };

        if(num==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("enter number");
       int num=new Scanner(System.in).nextInt();
        int len = order (num);


        if (isArmstrong (num, len)) {
            System.out.println(num + " is armstrong");
        }

        else{
            System.out.println(num + " is not armstrong");
        }


    }





}
