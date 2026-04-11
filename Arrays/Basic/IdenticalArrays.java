import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class IdenticalArrays {
    public  static void main(String[] args){
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> b = new ArrayList<>(Arrays.asList(3, 4, 1, 2, 5));
        boolean result = isIdentical(a,  b);
        System.out.println("The result is : " +result);
    }

    public static boolean isIdentical(List<Integer> a, List<Integer> b){
        if(a.size() != b.size()){
            return false;
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : a){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for(int num : b){
            if(!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0){
                return false;
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }
        return true;
    }
}