package Assignment7;

import java.util.ArrayList;

public class Ques2 {

    public static void main(String[] args) {
        int arr1[] = {1, 4, 5};
        int arr2[] = {3 ,4 ,5};

        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                i++;}
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;

            }
        }
        System.out.println(ans);
    }

}
