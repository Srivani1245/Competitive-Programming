import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class is_Anagram
{  
    static void Check_is_Anagram(String s1, String t1)
    {  
        String str1 = s1.replaceAll("\\s", "");  
        String str2 = t1.replaceAll("\\s", "");
        boolean check_status = true; 
        if (str1.length() != str2.length())
        {
            check_status = false;  
        }
        else{  
            char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            check_status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (check_status){  
            System.out.println("It is an Anagram");  
        }
        else{  
            System.out.println("It is not an Anagram");  
        }  
    }
    public static void main(String[] args)
    {  
        Check_is_Anagram("anagram","nagaram");
        Check_is_Anagram("Keep", "Peek");  
        Check_is_Anagram("Mother In Law", "Hitler Woman");  
        Check_is_Anagram("School Master", "The Classroom ");
        Check_is_Anagram("ASTRONOMERS","NO MORE STARS ");
        Check_is_Anagram("Toss","Shot");
        Check_is_Anagram("joy","enjoy");
        Check_is_Anagram("Debit Card","Bad Credit");
        Check_is_Anagram("SiLeNt CAT","LisTen AcT");
        Check_is_Anagram("Dormitory","Dirty Room");
        Check_is_Anagram("abc","ABC");
        Check_is_Anagram("Dictionary","assert");
        Check_is_Anagram("mother","father");
    }  
}  
