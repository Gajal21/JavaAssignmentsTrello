package Assignment5;

import java.util.Stack;

public class Ques2 {
    public static void main(String[] args) {
        String str= "Consultadd pvt";
        Stack<Character> st=new Stack<Character>();


        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));


            else {
                while (!st.empty()) {
                    System.out.print(st.pop());

                }
                System.out.print(" ");
            }
        }


        while (!st.empty()) {
            System.out.print(st.pop());

        }
    }
}
