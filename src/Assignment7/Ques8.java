package Assignment7;

public class Ques8 {
    public static void main(String[] args) {
        int a[]={100,200,455,98,34,22,89};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max)
                max=a[i];
        }
        System.out.printf("Maximum: "+max);
    }
}
