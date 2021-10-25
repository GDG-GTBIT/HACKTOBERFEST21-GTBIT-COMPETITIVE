import java.util.*;
public class Find_the_next_Greater_element 
{
    public static Scanner scn=new Scanner(System.in);

    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st=new Stack<>();
        long[] ans=new long[n];
        int k=n-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            while(st.size()>0 && st.peek()<arr[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ans[k]=-1;
                k--;
            }
            else
            {
                ans[k]=st.peek();
                k--;
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int n=scn.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextLong();
        }
        long[] ans=nextLargerElement(arr,n);
        for(int j=0;j<ans.length;j++)
        {
            System.out.print(ans[j]+" ");
        }
    } 
}

