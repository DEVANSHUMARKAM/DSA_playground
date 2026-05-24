//Chunky gets happy by eating Melody. Given an array arr[], each element represents the happiness Chunky gets by eating the melody.
//Chunky knows why Melody is so chocolaty but will only tell you once you tell him the maximum happiness he can get by eating two adjacent melodies.
//
//        Examples:
//
//Input : arr[] = [1, 2, 3, 4, 5]
//Output : 9
//Explanation: maximum happiness he can get is 9, selecting arr[3] = 4 and arr[4] = 5 which adds up to 9.
//Input : arr[] = [2, 1, 3, 4]
//Output : 7
//Explanation: maximum happiness he can get is 7, selecting arr[2] = 3 and arr[3] = 4 which adds up to 7.

import java.util.Arrays;
import java.util.List;

public class Melody_chocolate {
    public static void main(String[] args){
        List<Integer> arr =  Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("The maximum happiness is : " +maxHappiness(arr));

    }

    public static int maxHappiness (List<Integer> arr){
        if(arr == null || arr.size() < 2){
            return 0;
        }

        int max = arr.get(0) + arr.get(1);

        for(int i=1; i<arr.size() - 1; i++){
            int current = arr.get(i) + arr.get(i+1);
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}