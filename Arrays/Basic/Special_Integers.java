import java.util.Set;
import java.util.HashSet;

public class Special_Integers {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4};
        int n = 5;
        System.out.println("The result : " +findspecial(n, arr));
    }
    public static int findspecial(int n , int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int count = 0;

        for(int i : set){
            if(set.contains(i-1) && set.contains(i+1)){
                count++;
            }
        }
        return count;
    }
}