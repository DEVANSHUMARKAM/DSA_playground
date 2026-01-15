//You are given an array arr[], and you have to re-constructan array arr[].
//The values in arr[] are obtained by doing Xor of consecutive
//elements in the array.

public class Game_with_nos{
    public static void main(String[] args){
        int n = 5;
        int[] arr = {1,2,3,4,5};
        int result[] = game(arr,n);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();
    }

    public static int[] game(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i] ^ arr[i+1];
        }
        return arr;
    }
}