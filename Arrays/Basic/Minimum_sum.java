public class Minimum_sum {
    public static void main(String[] args){
        int[] arr1 = {5, 4, 13, 2, 1};
        int[] arr2 = {2, 3, 4, 6, 5};
        System.out.println("The output is : " +minsum(arr1, arr2));
    }

    public static int minsum(int[] arr1, int[] arr2){
        int n = arr1.length;

        int min1_1 = Integer.MAX_VALUE, min1_2 = Integer.MAX_VALUE;
        int idx1_1 = -1;

        for(int i=0; i<n; i++){
            if(arr1[i] < min1_1){
                min1_2 = min1_1;
                min1_1 = arr1[i];
                idx1_1 = i;
            }else if (arr1[i] < min1_2){
                min1_2 = arr1[i];
            }
        }

        int min2_1 = Integer.MAX_VALUE , min2_2 = Integer.MAX_VALUE;
        int idx2_1 = -1;

        for(int i=0; i<n; i++){
            if(arr2[i] < min2_1){
                min2_2 = min2_1;
                min2_1 = arr2[i];
                idx2_1 = i;
            }else if (arr2[i] < min2_2){
                min2_2 = arr2[i];
            }
        }

        if(idx1_1 != idx2_1){
            return min1_1 + min2_1;
        }else{
            return Math.min(min1_1 + min2_2 , min1_2 + min2_1);
        }
    }
}