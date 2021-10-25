import java.util.*;
public class Balanced_Parenthesis_problem 
{
    public static Scanner scn=new Scanner(System.in);

    public static boolean balancedParenthesis(String x)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='}')
            {
                if(st.size()>0 && st.peek()=='{')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(x.charAt(i)==')')
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
            else if(x.charAt(i)==']')
            {
                if(st.size()>0 && st.peek()=='[')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                st.push(x.charAt(i));
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
    public static void main(String[] args)
    {
        String str=scn.next();
        boolean ans=balancedParenthesis(str);
        if(ans==true)
        {
            System.out.println("Expression is Balanced.");
        }
        else
        {
            System.out.println("Expression is not Balanced.");
        }
    }
}

