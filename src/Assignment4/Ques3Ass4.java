package Assignment4;

import java.util.Scanner;

public class Ques3Ass4 {
    static boolean linearSearch(int a[], int target) {
        boolean isPresent = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                isPresent = true;
                break;
            }

        }
        return isPresent;
    }

    public static void main(String[] args) {
        int a[] = { 100, 200, 300, 400, 500 };
        System.out.println("Enter element that u want to search");
        Scanner sc=new Scanner(System.in);
        int target = sc.nextInt();
        if (linearSearch(a, target)) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }
    }
}
