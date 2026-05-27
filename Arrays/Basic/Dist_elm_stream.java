//Given an array of integers arr[], the task is to return the no of distinct elements in subarray arr[0, i] for 0 <= i <arr.size().
//The array will have positive and negative values. positive value means you have to append it into your data and negative value means you have to remove it from your data.
//        Note: If the element is not present in the data and you get the -ve of that element then no changes should occur.
//
//        Examples:
//
//Input: arr[] = [5, 5, 7, -5, -7, 1, 2, -2]
//Output: [1, 1, 2, 2, 1, 2, 3, 2]
//Explanation: Proper adding and removal of intgers will give this output.
//        Input: arr[] = [9, 9, 3, -9, -3, -9]
//Output: [1, 1, 2, 2, 1, 0]
//Explanation: Proper adding and removal of intgers will give this output.
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Dist_elm_stream {
    public static void main(String[] args){
        int[] arr = {5, 5, 7, -5, -7, 1, 2, -2};
        System.out.println("The result : " +getDistinct(arr));
    }

    public static List<Integer> getDistinct(int[] arr){
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int val : arr){
            if(val > 0){
                frequencyMap.put(val, frequencyMap.getOrDefault(val,0) + 1);
            }else if(val < 0){
                int target = Math.abs(val);
                if(frequencyMap.containsKey(target)){
                    int currentCount = frequencyMap.get(target);
                    if(currentCount > 1){
                        frequencyMap.put(target, currentCount - 1);
                    }else{
                        frequencyMap.remove(target);
                    }
                }
            }
            result.add(frequencyMap.size());
        }
        return  result;
    }
}