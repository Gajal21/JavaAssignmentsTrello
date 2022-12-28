package Assignment3;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        System.out.println("Enter n");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
             System.out.print("*");   
            }
            System.out.println();
        }
    }
}
