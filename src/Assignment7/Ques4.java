package Assignment7;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        //count no of words
        System.out.println("Enter your string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int cnt=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }
System.out.println(cnt);
    }
}
