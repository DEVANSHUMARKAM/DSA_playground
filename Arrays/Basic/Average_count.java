import java.util.HashMap;
import java.util.ArrayList;


public class Average_count {
    public static void main(String[] args){
        int[] arr = {2, 4, 8, 6, 2};
        int x = 2;
        System.out.println("The average count: " +countArray(arr,x));
    }
    public static ArrayList<Integer> countArray(int[] arr, int x){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int num:arr){
            int average = (num + x) / 2;

            int count = freqMap.getOrDefault(average, 0);
            result.add(count);
        }
        return result;
    }
}