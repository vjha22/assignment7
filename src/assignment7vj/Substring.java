package assignment7vj;

import java.util.*;
public class Substring
{
    public static String removeWord(String string, String word) 
    { 
        if (string.contains(word)) { 
  
            String tempWord = word + " "; 
            string = string.replaceAll(tempWord, ""); 
            tempWord = " " + word; 
            string = string.replaceAll(tempWord, ""); 
        } 
  
        return string; 
    } 
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String str1="";
        String str2="";
        String str3="";
        System.out.println("Enter String1");
        str1=s.nextLine();
        System.out.println("Enter String2");
        str2=s.nextLine();
        str3=removeWord(str1, str2);
        System.out.println(str3);
    }
}