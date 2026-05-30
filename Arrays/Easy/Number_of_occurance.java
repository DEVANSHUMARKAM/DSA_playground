public class Number_of_occurance {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,2,2,3,3,4};
        int target = 2;
        System.out.println("The number of occurance of " +target+ " is : " +findcount(arr,target));
    }
    public static int findcount(int[] arr, int target){
        int count = 0;
        int n = arr.length;

        if(n <= 0) return 0;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}