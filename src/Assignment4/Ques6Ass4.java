package Assignment4;

public class Ques6Ass4 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, 5, 6};
        int target = 6;
        boolean isPresent = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    isPresent = true;
                    System.out.println("index1: "+i + "," +"index2: "+ j);
                }
            }

        }
        if (isPresent == false) {
            System.out.println("index1: "+-1 + "," +"index2: "+ -1);
        }
    }
}
