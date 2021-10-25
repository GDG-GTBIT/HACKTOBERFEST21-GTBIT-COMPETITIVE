import java.util.*;
public class Expression_contains_redundant_bracket_or_not 
{
    public static Scanner scn=new Scanner(System.in);

    public static boolean invalidExpressionCheck(String str)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==')')
            {
                if(st.peek()=='(')
                {
                    return true;
                }
                while(st.size()>0 && st.peek()!='(')
                {
                    st.pop();
                }
                st.pop();
            }
            else
            {
                st.push(str.charAt(i));
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        String str=scn.next();
        boolean res=invalidExpressionCheck(str);
        if(res==true)
        {
            System.out.println("Yes, It contains Redundant/Unwanted Parenthesis.");
        }
        else
        {
            System.out.println("No, It doesn't contains Redundant/Unwanted Parenthesis.");
        }
    }
}

