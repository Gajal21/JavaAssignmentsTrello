package Assignment7;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ques1 {
    public static void main(String[] args) {
        String str="Consultadd";
        String a=str.toLowerCase();
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
        for (int i=0;i<a.length();i++)
        {
            if(h.containsKey(a.charAt(i))){
                h.put(a.charAt(i),h.get(a.charAt(i))+1);
            }
            else {
                h.put(a.charAt(i),1);
            }
        }

      char ans=' ';
        for (Map.Entry<Character,Integer> e:h.entrySet()){
           if(e.getValue()==1){
               ans=e.getKey();
               break;
           }
        }
        System.out.print(ans);
    }
}
