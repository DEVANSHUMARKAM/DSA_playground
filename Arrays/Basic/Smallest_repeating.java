import java.util.HashMap;
import java.util.Map;

public class Smallest_repeating {
    public static void main(String[] args){
        int[] arr = {2, 2, 1, 3, 1};
        int k = 2;
        System.out.println("The result is : " +findDuplicates(arr,k));
    }

    public static int findDuplicates(int[] arr , int k){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        int Minelement = Integer.MAX_VALUE;
        boolean found = false;

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == k){
                int currentNum = entry.getKey();

                if(currentNum < Minelement){
                    Minelement = currentNum;
                    found = true;
                }
            }
        }
        return found ? Minelement : -1;
    }
}