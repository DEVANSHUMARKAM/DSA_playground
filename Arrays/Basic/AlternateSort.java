import java.util.Arrays;
import java.util.ArrayList;

public class AlternateSort{
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        ArrayList<Integer> output = sortarr(arr);
        System.out.println("Result: " +output);

    }
    public static ArrayList<Integer> sortarr(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        ArrayList<Integer> result = new ArrayList<>();

        while(left <= right){
            if(right >= left){
                result.add(arr[left]);
                right--;
            }

            if(left <= right){
                result.add(arr[right]);
                left++;
            }
        }
        return result;
    }
}