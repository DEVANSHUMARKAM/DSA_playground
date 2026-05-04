public class Largest_product {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println("The largest product is : " +findmaxprod(arr,k));
    }
    public static int findmaxprod(int[] arr, int k){
        int n = arr.length;
        if(n < k) return 0;

        int currentprod = 1;

        for(int i=0; i<k; i++){
            currentprod *= arr[i];
        }

        int maxprod = currentprod;

        for(int i=k; i<n; i++){
            if(arr[i-k] == 0){
                currentprod = 1;
                for(int j=i-k+1; j<=i; j++){
                    currentprod *= arr[j];
                }
            }else{
                currentprod = (currentprod / arr[i-k] * arr[i]);
            }
            maxprod = Math.max(maxprod, currentprod);
        }
        return maxprod;
    }
}