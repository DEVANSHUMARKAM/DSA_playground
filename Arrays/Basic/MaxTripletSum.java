import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class MaxTripletSum {
    public static void main(String args[]){
        List<Integer> arr = Arrays.asList(3, 6, 4, 8, 9);
        System.out.println("Result " +maxsum(arr));
    }

    public static int maxsum(List<Integer> arr){
        int n = arr.size();
        Collections.sort(arr);

        int max = arr.get(n-1) + arr.get(n-2) + arr.get(n-3);
        return max;
    }
}