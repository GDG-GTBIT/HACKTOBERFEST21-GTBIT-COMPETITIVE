import java.util.*;
public class Write_a_program_to_find_the_longest_Palindrome_in_a_string_Longest_palindromic_Substring 
{
    public static Scanner scn=new Scanner(System.in);

    public static boolean palindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalin(String S)
    {
        ArrayList<String> al=new ArrayList<>();
        boolean res;
        for(int i=0;i<S.length();i++)
        {
            for(int j=i+1;j<=S.length();j++)
            {
                res=palindrome(S.substring(i,j));
                if(res==true)
                {
                    al.add(S.substring(i,j));
                }
            }
        }
        int maxSize=-(int)1e9;
        int idx=0;
        for(int k=0;k<al.size();k++)
        {
            if(al.get(k).length()>maxSize)
            {
                maxSize=al.get(k).length();
                idx=k;
            }
        }
        return al.get(idx);
    }
    public static void main(String[] args)
    {
        String str=scn.next();
        System.out.println(longestPalin(str));
    }
}

