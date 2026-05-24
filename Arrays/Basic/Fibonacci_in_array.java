import java.util.HashSet;

public class Fibonacci_in_array {
    public static void main(String[] args){
        long arr[] = {4, 2, 8, 5, 20, 1, 40, 13, 23};
        System.out.println("The final count is : " +countfibonacci(arr));
    }

    public static int countfibonacci(long[] arr){
        HashSet<Long> fibSet = new HashSet<>();
        long a = 0;
        long b = 1;

        while(true){
            if(Long.MAX_VALUE - b < a){
                break;
            }
            long next = a + b;
            fibSet.add(next);

            a = b;
            b = next;
        }

        int fibCount = 0;
        for(long num : arr){
            if(fibSet.contains(num)){
                fibCount++;
            }
        }
        return fibCount;
    }
}