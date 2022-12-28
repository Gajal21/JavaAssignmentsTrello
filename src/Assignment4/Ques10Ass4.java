package Assignment4;

import java.util.Arrays;
public class Ques10Ass4 {
    public static boolean equal(int a1[],int a2[])
    {
           int n=a1.length;
           int m=a2.length;
           Arrays.sort(a1);
           Arrays.sort(a2);
           if (n!= m) 
              return false; 
           for (int i = 0; i < n; i++) 
           {
               if (a1[i] != a2[i]) 
                   return false; 
           }
           return true;

   }
  
    public static void main(String[] args) {
        int a1[]={2,4,13,1};
        int a2[]={4,2,1,13};
        if(equal(a1, a2)){
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Both the arrays are not equal");
        }
    }
}
