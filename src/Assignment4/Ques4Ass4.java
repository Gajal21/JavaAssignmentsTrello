package Assignment4;

import java.util.Scanner;

public class Ques4Ass4 {

    static boolean binarySearch(int a[], int s, int e, int target) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == target) {
                return true;

            } else if (a[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int a[] = { 100, 200, 300, 400, 500 };
        System.out.println("Enter element that u want to search");
        int target = new Scanner(System.in).nextInt();
        if (binarySearch(a, 0, a.length - 1, target)) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }
    }
}
