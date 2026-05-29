import java.util.HashMap;
import java.util.Map;

public class Equal_Arrays {
    public static void main(String[] args){
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};
        boolean result = checkEqual(a,b);
        System.out.println("The result : " +result);
    }
    public static boolean checkEqual(int[] a, int[] b){
        if(a.length != b.length){
            return  false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int x : a){
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        for(int x : b){
            if(!map.containsKey(x) || map.get(x) == 0){
                return false;
            }
            map.put(x, map.get(x) - 1);
        }
        return true;
    }
}