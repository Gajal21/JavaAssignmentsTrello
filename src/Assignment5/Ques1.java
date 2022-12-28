package Assignment5;

public class Ques1 {
    public static void main(String[] args) {
        String str="Consultadd";
        String ans="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ans=ans+str.charAt(i);
        }
        System.out.println("Reversed String: "+ans);
    }
}
