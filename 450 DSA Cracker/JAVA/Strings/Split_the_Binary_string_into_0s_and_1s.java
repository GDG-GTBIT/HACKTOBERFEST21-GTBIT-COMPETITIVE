import java.util.*;
public class Split_the_Binary_string 
{
    public static Scanner scn=new Scanner(System.in);

    public static int split(String str)
    {
        int zeroCount=0;
        int oneCount=0;
        int ansCount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                zeroCount++;
            }
            if(str.charAt(i)=='1')
            {
                oneCount++;
            }
            if(zeroCount==oneCount)
            {
                ansCount++;
                zeroCount=0;
                oneCount=0;
            }
        }
        if(ansCount==0)
        {
            return -1;
        }
        return ansCount;
    }
    public static void main(String[] args)
    {
        String str=scn.next();
        System.out.println(split(str));
    }
}

