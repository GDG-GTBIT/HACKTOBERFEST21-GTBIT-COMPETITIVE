import java.util.*;
public class Reverse_a_String_using_Stack 
{
    public static Scanner scn=new Scanner(System.in);

    public static String reverse(String S)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            st.push(S.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0)
        {
            sb.append(st.peek());
            st.pop();
        }
        String ans=sb.toString();
        return ans;
    }
    public static void main(String[] args)
    {
        String str=scn.next();
        System.out.println(reverse(str));
    }
}
