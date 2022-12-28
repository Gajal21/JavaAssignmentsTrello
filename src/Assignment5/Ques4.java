package Assignment5;

import java.util.Scanner;

public class Ques4{
    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter your character for that you want to find the occurence");
        char c=sc.next().charAt(0);
     
        int occurence=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                occurence++;
        
            }
            
        }
        System.out.println("The occurence of character is: "+occurence);
    }
}