import java.util.Arrays;

public class MinProduct {
    public  static void main(String[] args){
        int[] arr = {2,3,5,67,2,4};
        int k = 2;
        int result = findprod(arr,k);
        System.out.println(result);
    }

    public static int findprod(int[] arr, int k){
        long MOD = 1000000007L;

        Arrays.sort(arr);
        long product = 1;

        for(int i=0; i<k; i++){
            product = (product * arr[i]) % MOD;
        }
        return(int) product;
    }
}