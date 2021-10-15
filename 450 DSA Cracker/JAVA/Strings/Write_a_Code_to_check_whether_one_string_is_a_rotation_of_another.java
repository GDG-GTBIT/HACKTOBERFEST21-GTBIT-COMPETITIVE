import java.util.*;
public class Write_a_Code_to_check_whether_one_string_is_a_rotation_of_another 
{
    public static Scanner scn=new Scanner(System.in);

    public static void rotation(String str1, String str2)
    {
        String str=str1+str1;
        int len=str.length();           
        int len2=str2.length();           
        for(int i=0;i<len-(len2-1);i++)   //Formula used: strlen-(str2len-1)
        {
            if(str.substring(i,i+len2).equals(str2))
            {
                System.out.println("Strings are Rotations of each other.");
                return;
            }
        }
        System.out.println("Strings are not Rotations of each other.");
    }
    public static void main(String[] args)
    {
        String str1=scn.next();
        String str2=scn.next();
        rotation(str1,str2);
    }
}

