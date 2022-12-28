package Assignment4;

public class Ques2Ass4 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int ele : a) {
            sum = sum + ele;
        }

        double average = sum / a.length;
        System.out.println("The average is: " + average);

    }
}
