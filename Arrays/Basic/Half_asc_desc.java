import java.util.Arrays;
import java.util.ArrayList;

public class Half_asc_desc {
    public static void main(String[] args){
        int[] arr = {4,2,5,8,9,2,4};
        ArrayList<Integer> output = sort_hafl(arr);
        System.out.println("The result: " +output);
    }

    public static ArrayList<Integer> sort_hafl(int[] arr){
        int n = arr.length;
        int mid = n / 2;

        Arrays.sort(arr, 0 , mid);
        Arrays.sort(arr, mid, n);

        int left = mid;
        int right = n -1 ;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr){
            result.add(num);
        }
        return result;
    }
}