package Assignment5;

import java.util.Arrays;
public class Ques3{
    static boolean  isAnagram(char[] c1, char []c2,int len1,int len2){
            if(len1!=len2){
                return false;
            }
        Arrays.sort(c1);
        System.out.println(c1);
        Arrays.sort(c2);
        System.out.println(c2);
       for(int i=0;i<len1;i++){
        if(c1[i]!=c2[i]){
            return false;
        }
       }



        return true;
    }
    public static void main(String[] args) {
        String str1="gajal";
        char c1[]=str1.toCharArray();
        String str2="lagaj";
        char c2[]=str2.toCharArray();
        int len1=str1.length();
        int len2=str2.length();
        if(isAnagram( c1, c2,len1,len2))
        {
            System.out.println("Strings are Anagram");
        }   
        else{
            System.out.println("Strings are not anagram");
        }
    }
}