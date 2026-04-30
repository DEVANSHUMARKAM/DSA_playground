public class Missing_shuffle_array {
    public static void main(String[] args){
        int[] arr1 = {12, 10, 15, 23, 11, 30} ;
        int[] arr2 = {15, 12, 23, 11, 30};

        System.out.println("The missing number is: " +findmissing(arr1, arr2));
    }

    public static int findmissing(int[] arr1, int[] arr2){
        int xorSum = 0;

        for(int num : arr1){
            xorSum ^= num;
        }

        for(int num : arr2){
            xorSum ^= num;
        }
        return xorSum;
    }
}