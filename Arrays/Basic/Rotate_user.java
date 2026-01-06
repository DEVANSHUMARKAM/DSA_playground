import java.util.Arrays;

class Rotate_user{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int d = 2;
        rotate(arr, d);
        System.out.println("Result: " +Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int d){
        int n = arr.length;
        if(n==0)
            return ;

        d = d % n;
        reverse(arr, 0 , d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse (int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}