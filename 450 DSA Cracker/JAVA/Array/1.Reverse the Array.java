import java.util.*;

public class reverseTheArray {

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }
}
