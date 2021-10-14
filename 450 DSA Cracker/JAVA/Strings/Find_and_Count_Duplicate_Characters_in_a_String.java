import java.util.*;
public class Find_and_Count_Duplicate_Characters_in_a_String 
{
    public static Scanner scn=new Scanner(System.in);

    public static void duplicates(String str)
    {
        ArrayList<Character> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        char ch;
        boolean isFound;
        for(int i=0;i<str.length();i++)
        {
            isFound=false;
            ch=str.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            for(int j=0;j<al.size();j++)
            {
                if(al.get(j)==ch)
                {
                    al1.set(j,al1.get(j)+1);
                    isFound=true;
                    break;
                }
            }
            if(isFound==false)
            { 
                al.add(ch);
                al1.add(1);
            }
        }
        for(int k=0;k<al1.size();k++)
        {
            if(al1.get(k)!=1)
            {
                System.out.println(al.get(k)+", count = "+al1.get(k));
            }
        }
    }
    public static void main(String[] args)
    {
        String str=scn.next(); //test_string
        duplicates(str);
    }
}
