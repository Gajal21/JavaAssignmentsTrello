package Assignment5;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {

        System.out.println("Enter your string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels_cnt = 0;
        int consonants_cnt = 0;
        int space=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                vowels_cnt++;

            } 
            else if(c==' ')
            {
             space++;
            }
            else {
                consonants_cnt++;
            }
        }
        System.out.println("Total vowels: "+vowels_cnt);
        System.out.println("Total consonants: "+consonants_cnt);
    }
}
