import java.util.Scanner;
class linearSearching{

    static int mxvalue=Integer.MAX_VALUE;//min or max value can be used as we cant use -1 as there might be element "-1"

    static boolean lSearch(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    static int lSearchIndex(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    static int lSearchElement(int[] arr,int num){
        for(int element  : arr){
            if(element==num){
                return element;
            }
        }
 
        return mxvalue;
    }
    static int lSearchRange(int[] arr,int num,int start,int end){
        if((start>end || start<0 )|| (end<start || end>arr.length-1)){
            return 66;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==num){
                return arr[i];
            }
        }
        return mxvalue;
    }
    static int[] search2Dpos(int[][] arr , int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
        public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int ch=0;
        int arr[] = {4,3,2,1,5};
        while(ch!=99){
            System.out.println("\nEnter 1: seen if element is present\n2: get the index of the element if present\n3:print the searched element\n4:to print element within a Range \n5:to print pos of a 2d array \n99:to exit");
             ch= inp.nextInt();
            switch(ch){
                case 1:
                {
                        System.out.println("enter the element to search:");
                        int s=inp.nextInt();
                        boolean result=lSearch(arr,s);
                        if(result){
                                System.out.println("Element is present"); 
                        }
                        else{
                                System.out.println("Not present");
                        }
                        break;
                }
                case 2 :
                {
                        System.out.println("enter the element to search:");
                        int s=inp.nextInt();
                        int result =lSearchIndex(arr,s);
                        if(result==-1){
                            System.out.println("element not present");
                        }
                        else{
                            System.out.println("Present at " + result+" position");
                        }
                        break;
                }
                case 3 :
                {
                        
                        System.out.println("enter the element to print the searched element:");
                        int s=inp.nextInt();
                        int result =lSearchElement(arr,s);
                        if(result==mxvalue){
                            System.out.println("element not present");
                        }
                        else{
                            System.out.println(result);
                        }
                        break;
                }
                case 4 :
                {
                        
                        System.out.println("enter the element to print the searched element:");
                        int s=inp.nextInt();
                        System.out.println("enter the start and end of the range");
                        int r1=inp.nextInt();
                        int r2=inp.nextInt();
                        
                        int result =lSearchRange(arr,s,r1,r2);
                        if(result==mxvalue){
                            System.out.println("element not present");
                        }
                        if(result==66){
                             System.out.println("Range out of bounds");
                        }
                        else{
                            System.out.println(result);
                        }
                        break;
                }
                case 5:{
                    int Arr2d[][]={
                        {2,3,4},
                        {7,5,6},
                        {1,22,56}
                    };
                    System.out.println("enter the element to be searched: ");
                    int s= inp.nextInt();
                    int[] result =search2Dpos(Arr2d,s);
                    if(result[0]!=-1)
                        System.out.println("Element lies in "+(result[0]+1)+" row and  "+(result[1]+1)+" column");
                    else{
                        System.out.println("Element not present");
                    }
                    break;
                }
                default:{
                            System.out.println("Invalid choice");
                }
            
            }
        }
    }
}