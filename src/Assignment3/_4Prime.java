package Assignment3;

import java.util.Scanner;

public class _4Prime {
static boolean isPrime(int num){
if(num==0 || num==1){
    return false;
}

for(int i=2;i<=num/2;i++){
    if(num%i==0){
        return false;
    }
}

    return true;
}

    public static void main(String[] args) {
        System.out.println("Enter your number");
        int a=new Scanner(System.in).nextInt();
      if(isPrime(a))
      {
        System.out.println(a+" is a prime number");
      }
      else
      {
        System.out.println(a+" is not a prime number");
      }
    }
}
