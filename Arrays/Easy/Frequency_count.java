import java.util.List;
import java.util.ArrayList;

public class Frequency_count {
    public static void main(String[] args){
        int arr[] = {2, 3, 2, 3, 5};
        System.out.println("The result is : " +countfrequency(arr));
    }
    public static List<Integer> countfrequency(int[] arr){
        int n = arr.length;
        int[] freq = new int[n];

        for(int x : arr){
            if(x >= 1 && x <= n){
                freq[x-1]++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int count : freq){
            result.add(count);
        }
        return result;
    }
}