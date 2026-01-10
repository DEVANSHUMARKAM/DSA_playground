import java.util.Arrays;

public class Rotate_array{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        find(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void find(int arr[], int k){
        int n = arr.length;
        if(n==0) return;

        k = k % n;
        if(k==0) return;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}