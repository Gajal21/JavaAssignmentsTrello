package Assignment4;

public class Ques9Ass4 {

    public static void main(String[] args) {

        int nums[] = { 1, 4, 10, -3 };
        int target = 14;
        boolean isPresent = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    isPresent = true;
                    System.out.println(i + "," + j);
                }
            }

        }
        if (isPresent == false) {
            System.out.println(-1 + "," + -1);
        }
    }
}
