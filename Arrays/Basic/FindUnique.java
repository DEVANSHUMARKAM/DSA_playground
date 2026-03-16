import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,2};
        int k = 4;
        int result = findunique(k,arr);
        System.out.println("Result: " +result);
    }

    public static int findunique(int k , int[] arr){
        HashMap<Integer , Integer> counts = new HashMap<>();

        for(int num : arr){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            if(entry.getValue() % k != 0){
                return entry.getKey();
            }
        }
        return -1;
    }
}