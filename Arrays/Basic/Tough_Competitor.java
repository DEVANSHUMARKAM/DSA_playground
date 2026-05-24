//Given an array arr[] of non-negative integers representing the skill levels of competitors, determine the minimum absolute difference between the skills of any two competitors. Competitors are considered tough if their skill difference is the smallest among all possible pairs.
//
//Examples:
//
//Input: arr[] = [9, 4, 12, 6]
//Output: 2
//Explanation: The smallest difference between skill values is |4-6| = 2.
//Input: arr[] = [4, 9, 1, 32, 12]
//Output: 3
//Explanation: The smallest differences are |4-1| = 3 and |9-12| = 3. Thus, the smallest difference is 3.
import java.util.Arrays;
import java.util.Collections;

public class Tough_Competitor {
    public static void main(String[] args){
        int arr[] = {4, 9, 1, 32, 12};
        System.out.println("The output is: " +minDiff(arr));
    }

    public static int minDiff(int[] arr){
        int n = arr.length;

        if(n < 2){
            return 0;
        }
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for(int i=0; i<n-1; i++){
            int current = arr[i+1] - arr[i];
            if(current < min){
                min = current;
            }
        }
        return min;
    }
}