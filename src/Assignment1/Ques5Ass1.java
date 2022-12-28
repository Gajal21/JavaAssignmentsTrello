package Assignment1;

import java.util.Scanner;

public class
Ques5Ass1 {
    public static void main(String[] args) {
        //Write a program to print the area of circle, Take radius as input from the user.(Area = 3.14*radius*radius)
        System.out.println("Enter the radius of the circle");
        int radius=new Scanner(System.in).nextInt();
        double area=3.14*radius*radius;
        System.out.println("The area of circle is: "+area);
         
    }
}
