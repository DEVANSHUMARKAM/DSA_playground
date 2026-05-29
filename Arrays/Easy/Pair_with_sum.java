import java.util.HashSet;

public class Pair_with_sum {
    public static void main(String[] args){
        int arr[] = {0, -1, 2, -3, 1};
        int target = -2;
        boolean result = isexist(arr,target);
        System.out.println("The result is : " +result);
    }

    public static boolean isexist(int[] arr, int target){
        int n = arr.length;
        if(n <= 1){
            return false;
        }

        HashSet<Integer> seen = new HashSet<>();

        for(int num : arr){
            int complement = target - num;

            if(seen.contains(complement)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}