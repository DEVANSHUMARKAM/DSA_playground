public class Missing_in_Array {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        System.out.println("The missing number is : " +findmissing(arr));
    }
    public static int findmissing(int[] arr){
        int n = arr.length + 1;
        long expectedsum = (long) n * (n + 1) / 2 ;

        long actualsum = 0;
        for(int num : arr){
            actualsum += num;
        }
        return (int) (expectedsum - actualsum);
    }
}