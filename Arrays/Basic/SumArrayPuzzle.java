import java.util.List;
import java.util.Arrays;

public class SumArrayPuzzle {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(3, 6, 4, 8, 9);
        sumArray(arr);
        System.out.println(arr);
    }

    public static void sumArray(List<Integer> arr){
        int n = arr.size();
        if(n == 0) return;

        int totalsum = 0;
        for(int num : arr){
            totalsum += num;
        }

        for(int i=0; i<n; i++){
            int currentval = arr.get(i);

            arr.set(i, (int)(totalsum - currentval));
        }
    }
}