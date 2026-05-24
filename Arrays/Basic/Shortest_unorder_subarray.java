public class Shortest_unorder_subarray {
    public static void main(String[] args){
        int arr[] = {7, 9, 10, 8, 11};
        System.out.println("The shortest subarray: " +shortessubarray(arr));
    }

    public static int shortessubarray(int[] arr){
        int n = arr.length;

        if( n < 3){
            return 0;
        }

        for(int i=1; i<n-1; i++){

            boolean isPeak = (arr[i] > arr[i-1] && arr[i] > arr[i+1]);

            boolean isValley = (arr[i] < arr[i-1] && arr[i] < arr[i+1]);

            if(isPeak || isValley){
                return 3;
            }
        }
        return 0;
    }
}