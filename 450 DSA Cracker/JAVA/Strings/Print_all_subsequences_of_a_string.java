import java.util.*;
public class Print_all_subsequences_of_a_string 
{
    public static Scanner scn=new Scanner(System.in);

    public static ArrayList<String> gss(String str) 
    {
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        ArrayList<String> recAns=gss(str.substring(1));
        ArrayList<String> myAns=new ArrayList<>();
        for(String s:recAns)
        {
            myAns.add(s);
        }
        for(String s:recAns)
        {
            myAns.add(ch+s);
        }
        return myAns;
    }

    public static void main(String[] args)
    {
       String str=scn.next();
       System.out.println(gss(str));
    }
}

