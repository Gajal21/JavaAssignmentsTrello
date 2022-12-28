package Assignment1;

public class Ques3Ass1 {
    public static void main(String[] args) {
        //Swap two numbers using the third variable as the result name and do the same task without using any
        //third variable.
        //1 Approach-> using third variable
    int a=10;
    int b=20;
    System.out.println("Before Swapping using third variable");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
     int c=a;
     a=b;
     b=c;
    System.out.println("After Swapping using third variable");
    System.out.println("a: "+a);
    System.out.println("b: "+b);


    System.out.println();
    //2 Approach-> without  using third variable
    int d=100;
    int e=200;
    System.out.println("Before Swapping without using third variable");
    System.out.println("d: "+d);
    System.out.println("e: "+e);
     d=d+e;//300
     e=d-e; //300-200=100
     d=d-e;

    System.out.println("After Swapping without using third variable");
    System.out.println("d: "+d);
    System.out.println("e: "+e);


    }
}
