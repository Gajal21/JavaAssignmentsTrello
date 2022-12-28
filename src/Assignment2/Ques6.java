package Assignment2;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        System.out.println("Enter first operand");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter second operand");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Enter your choice \n1 for ADD \n2 for SUB \n3 for MUL \n4 for DIV");
        int m = new Scanner(System.in).nextInt();
        switch (m) {
            case 1:
                int add = a + b;
                System.out.println("The addition of first and second is: " + add);
                break;

            case 2:
                int sub = a - b;
                System.out.println("The addition of first and second is: " + sub);

                break;

            case 3:
                int mul = a * b;
                System.out.println("The multiplication of first and second is: " + mul);

                break;

            case 4:
                int div = a / b;
                System.out.println("The division of first and second is: " + div);

                break;

            case 5:
                int rem = a % b;
                System.out.println("The remainder of first and second is: " + rem);
            default:
                System.out.println("Please enter valid choice");
        }
    }
}
