package Assignment5;

import java.util.Scanner;
import java.util.Stack;
public class Ques8 {
   
    static boolean isValidParanthesis(String str)
    {
        Stack<Character> stack=new Stack<>();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            char chr=ch[i];
            if(chr=='{'|| chr=='['|| chr=='('){
                stack.push(chr);
            }
            else
            {
        
                if(!stack.isEmpty())
                {
                      char top=stack.peek();
                    if((chr=='}' && top=='{') ||(chr==']' && top=='[') || (chr==')' && top=='(')){
                        stack.pop();

                    }
                    else{
                        return false;
                    }
                }
                else{
                   return true; 
                }

            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
   
        if(isValidParanthesis(str)){
            System.out.println("Valid paranthesis");
        }
        else{
            System.out.println("Not valid paranthesis");
        }


    }
}
