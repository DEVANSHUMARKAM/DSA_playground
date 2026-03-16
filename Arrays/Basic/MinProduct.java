import java.lang.Math;

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
        int n = arr.length;
        Arrays.sort(arr);
        int limit = Math.min(k,n);
        long product = 1;

        for(int i=0; i<limit; i++){
            product = (product * (long) arr[i]) % MOD;
        }
        return(int) product;
    }
}