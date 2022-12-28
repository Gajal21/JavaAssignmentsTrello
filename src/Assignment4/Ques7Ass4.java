package Assignment4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class Ques7Ass4 {
    public static void main(String[] args) {
//         nput: [2,2,3,3,4,4,4,11,11,11,11]
// output:[2,3,4,11,0,0,0,0,0,0,0]
 int a[]={2,2,3,3,4,4,4,11,11,11,11};
 HashSet<Integer> h=new HashSet<>();
 for(int i=0;i<a.length;i++){
    h.add(a[i]);
 }

       int output[]=new int[a.length];
       int index=0;
        for (int i : h)
           output[index++]=i;


        System.out.printf(Arrays.toString(output));



    }
}
