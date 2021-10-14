import java.util.*;
public class Check_whether_a_String_is_Palindrome_or_not 
{
    public static Scanner scn=new Scanner(System.in);

    public static String palindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return "Not a Palindrome";
            }
            i++;
            j--;
        }
        return "It is a Palindrome";
    }
    public static void main(String[] args)
    {
        String str=scn.next();
        System.out.println(palindrome(str));
    }
}

