public class Co_Prime_Array {
    public static void main(String[] args){
        int[] arr = {2, 7, 28};
        System.out.println("The output :  " +countcoprime(arr));
    }

    public static int countcoprime(int[] arr){
        int insertions = 0;
        int n = arr.length;
        if(n <= 1) return 0;

        for(int i=0; i<n-1; i++){
            if(gcd(arr[i] , arr[i+1]) > 1){
                insertions++;
            }
        }
        return  insertions;
    }
    private static int gcd(int a, int b) {
        while (b != -0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    }
