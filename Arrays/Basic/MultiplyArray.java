public class MultiplyArray {
    public static void main(String[] args){
        int[] arr = {2,2,2,2,2};
        int n = 5;
        System.out.println("The product of all elements: " +findproduct(arr,n));
    }

    public static int findproduct(int[] arr, int n){
        int totalproduct = 1;
        for(int i=0; i<n; i++){
            totalproduct = totalproduct * arr[i];
        }
        return totalproduct;
    }
}