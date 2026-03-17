import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ReverseSubarray {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int l = 2;
        int r = 4;
        ArrayList<Integer> result = reverse(arr,l,r);
        System.out.println("Result: " +result);

    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> arr , int l , int r){
        int start = l - 1;
        int end = r - 1;

        while(start<end){
            int leftvalue = arr.get(start);
            int rightvalue = arr.get(end);

            arr.set(start, rightvalue);
            arr.set(end, leftvalue);

            start++;
            end--;
        }
        return arr;
    }
}