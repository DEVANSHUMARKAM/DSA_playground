import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;


public class Even_ocr_elem {
    public static void main(String[] args){
        int arr[] = {9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15};
        System.out.println("The result is: " +findevenoccurance(arr));
    }
    public static List<Integer> findevenoccurance(int[] arr){
        LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() % 2 == 0){
                result.add(entry.getKey());
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}