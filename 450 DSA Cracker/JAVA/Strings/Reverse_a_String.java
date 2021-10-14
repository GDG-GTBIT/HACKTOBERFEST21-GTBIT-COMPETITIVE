import java.util.*;
public class Reverse_a_String 
{
    public static Scanner scn=new Scanner(System.in);

    public static char[] reverse(char[] arr)
    {
        char temp;
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int n=scn.nextInt(); 
        char[] arr=new char[n]; 
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.next().charAt(0);
        }
        arr=reverse(arr);
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}

