public class arrayMinMaxElement {
    
    public static void main(String[] args) {
        int arr[] = {1,12,9,10,5};
        Pair minmax = getMinMax(arr);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    }
   
    static class Pair {
 
        int min;
        int max;
    }
 
    static Pair getMinMax(int arr[]) {
        Pair minmax = new  Pair();

        if(arr[0] < arr[1]){
            minmax.min = arr[0];
            minmax.max = arr[1];
        } else {
            minmax.min = arr[1];
            minmax.max = arr[0];
        }

        for(int i = 2; i < arr.length; i++) {
            if(arr[i] < minmax.min) {
                minmax.min = arr[i];
            } else if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
        }
        return minmax;
    }
}
