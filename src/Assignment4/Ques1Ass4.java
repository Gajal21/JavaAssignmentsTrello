package Assignment4;

import java.util.Scanner;

public class Ques1Ass4 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("printing elements");
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}