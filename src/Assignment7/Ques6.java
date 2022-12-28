package Assignment7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ques6 {
    public static void main(String[] args) {
        String str="ConsultaddInc";
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
        for (int i=0;i<str.length();i++)
        {
            if(h.containsKey(str.charAt(i))){
                h.put(str.charAt(i),h.get(str.charAt(i))+1);
            }
            else {
                h.put(str.charAt(i),1);
            }
        }
        System.out.println("Ocuurence of:");
        for(Map.Entry<Character,Integer> e:h.entrySet()){
            System.out.printf(e.getKey()+" is: "+e.getValue());
            System.out.println();
        }
    }
}
