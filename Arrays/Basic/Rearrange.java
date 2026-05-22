import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Rearrange{
    public static void main(String[] args){
        int[] arr = {4, 5, 1, 2, 3};
        ArrayList<Integer> output = new ArrayList<>();
//        output = rearrange(arr);
        System.out.println("The result: " +rearrange(arr));
    }

    public static ArrayList<Integer> rearrange(int[] arr){
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        ArrayList<Integer> result = new ArrayList<>();

        while(left <= right){
            if(left == right){
                result.add(arr[left]);
                break;
            }

            result.add(arr[left]);
            left++;

            result.add(arr[right]);
            right--;
        }
        return  result;
    }
}