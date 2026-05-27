//Given an array arr[] of integers, the task is to check whether obtaining an array with distinct adjacent elements is possible by swapping two neighboring array elements.
//
//Examples:
//
//Input: arr[] = [1, 1, 2]
//Output: true
//Explanation: Swapping last 2 elements can result in [1, 2, 1].
//Input: arr[] = [7, 7, 7, 7]
//Output: false
//Explanation: We can't swap to obtain distinct elements in neighbor.
import java.util.HashMap;

public class Dist_adj_elm {
    public static void main(String[] args){
        int[] arr1 = {1,1,2};
        int[] arr2 = {7,7,7,7};
        boolean result1 = finddistinct(arr1);
        boolean result2 = finddistinct(arr2);
        System.out.println("First result : " +result1);
        System.out.println("Second result : " +result2);
    }

    public static boolean finddistinct(int[] arr){
        int n = arr.length;
        if (n <= 1) return true;

        HashMap<Integer, Integer> counts = new HashMap<>();
        int maxFreq = 0;

        for(int x : arr){
            int currentFreq = counts.getOrDefault(x,0) + 1;
            counts.put(x, currentFreq);

            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
            }
        }
        return maxFreq <= (n + 1) / 2;
    }
}