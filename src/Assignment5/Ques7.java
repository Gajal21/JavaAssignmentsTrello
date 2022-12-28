package Assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Ques7 {

    static boolean isIsogram(String str)
{
char ch[]=str.toCharArray();
HashMap<Character,Integer> map=new HashMap<>();
for(int i=0;i<ch.length;i++){
if(map.containsKey(ch[i])){
    map.put(ch[i],map.get(ch[i])+1);
}
else{
    map.put(ch[i],1);
}

}

for(Map.Entry e:map.entrySet()){
    int val=(int)e.getValue();
    if(val>1){
        return false;

    }
}
return true;

}
    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(isIsogram(str)){
            System.out.println("String is isogram");
        }
        else{
            System.out.println("Not Isogram");
        }


            String string   = "Be Happy and Stay Motivated";
            Stack<Character> st=new Stack<Character>();


            for (int i = 0; i < string.length(); ++i) {
                if (string.charAt(i) != ' ')
                    st.push(string.charAt(i));


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
