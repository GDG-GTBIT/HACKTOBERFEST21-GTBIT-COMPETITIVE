class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long[] nextSmallerOnLeft(long[] arr,long n)
  {
      Stack<Integer> st=new Stack<>();
      long[] nsl=new long[arr.length];
      int k=0;
      for(int i=0;i<arr.length;i++)
      {
          while(st.size()>0 && arr[st.peek()]>=arr[i])
          {
              st.pop();
          }
          if(st.size()==0)
          {
              nsl[k]=-1;
              k++;
          }
          else
          {
              nsl[k]=st.peek();
              k++;
          }
          st.push(i);
      }
      return nsl;
  }
  public static long[] nextSmallerOnRight(long[] arr,long n)
  {
      Stack<Integer> st=new Stack<>();
      long[] nsr=new long[arr.length];
      int k=arr.length-1;
      for(int i=arr.length-1;i>=0;i--)
      {
          while(st.size()>0 && arr[st.peek()]>=arr[i])
          {
              st.pop();
          }
          if(st.size()==0)
          {
              nsr[k]=arr.length;
              k--;
          }
          else
          {
              nsr[k]=st.peek();
              k--;
          }
          st.push(i);
      }
      return nsr;
  }
    public static long getMaxArea(long hist[], long n) 
    {
        long[] nsl=nextSmallerOnLeft(hist,n);
        long[] nsr=nextSmallerOnRight(hist,n);
        long[] ans=new long[hist.length];
        int j=0;
        for(int i=0;i<hist.length;i++)
        {
            ans[j]=hist[i]*(nsr[i]-nsl[i]-1);
            j++;
        }
        long maxEle=-(long)1e9;
        for(int k=0;k<ans.length;k++)
        {
            if(ans[k]>maxEle)
            {
                maxEle=ans[k];
            }
        }
        return maxEle;
    }      
}

