package Assignment4;

import java.util.Arrays;

public class Ques8Ass4   {
    public static void main(String[] args) {
        int a[]= {1 ,16, 2, 19, 10, 20,};
        //Approach1
        Arrays.sort(a);
        System.out.println(a[a.length-3]);


        //Approach2
        int first=a[0];
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>first){
                third=second;
                second=first;
                first=a[i];
            }
            else if(a[i]>second){
                third=second;
                second=a[i];
            }
            else if(a[i]>third)
            {
                third=a[i];
            }
        }
        System.out.println(third);
    }
}
