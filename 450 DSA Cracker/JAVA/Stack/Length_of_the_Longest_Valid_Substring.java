import java.util.*;
public class Length_of_the_Longest_Valid_Substring 
{
    public static Scanner scn=new Scanner(System.in);

    public static boolean balancedParenthesis(String str)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                st.push(str.charAt(i));
            }
            else
            {
                if(st.size()>0 && st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.size()!=0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static int findMaxLen(String S) 
    {
        int maxLength=-(int)1e9;
        for(int i=0;i<=S.length()-2;i++)
        {
            for(int j=i+2;j<=S.length();j=j+2)
            {
                boolean res=balancedParenthesis(S.substring(i,j));
                if(res==true)
                {
                    if(S.substring(i,j).length()>maxLength)
                    {
                        maxLength=S.substring(i,j).length();
                    }
                }
            }
        }
        if(maxLength==-(int)1e9)
        {
            return 0;
        }
        else
        {
            return maxLength;
        }
    }
    public static void main(String[] args)
    {
        String str=scn.next();
        System.out.println(findMaxLen(str));
    }
}

