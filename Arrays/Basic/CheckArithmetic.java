import java.util.Arrays;


public class CheckArithmetic {
    public static void main(String[] args){
        int[] arr1 = {0, 12, 4, 8};
        int[] arr2 = {2,4,53,1,32};
        Boolean result1 = check(arr1);
        Boolean result2 = check(arr2);
        System.out.println("For array 1 " +result1);
        System.out.println("For array 2 " +result2);
    }

    public static boolean check(int[] arr){

        if(arr.length <= 2) return true;

        Arrays.sort(arr);

        int d = arr[1] - arr[0];

        for(int i=2; i<arr.length; i++){
            if(arr[i] - arr[i-1] != d){
                return false;
            }
        }
        return true;
    }
}