import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Swap_kth_element{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        int k = 2;

        System.out.println("Before: " + arr);

        swap(arr, k);

        System.out.println("After:  " + arr);
    }
    public static void swap(List<Integer> arr, int k){
        int n = arr.size();

        int firstindex = k - 1;
        int lastindex = n - k;

        int val1 = arr.get(firstindex);
        int val2 = arr.get(lastindex);

        arr.set(firstindex, val2);
        arr.set(lastindex, val1);
    }
}