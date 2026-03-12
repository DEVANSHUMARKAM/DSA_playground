import java.util.List;
import java.util.Arrays;
import java.lang.Math.*;

public class MinValBalance{
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        int result = findvalue(arr);
        System.out.println("The value to be added is: " +result);
    }
    public static int findvalue(List<Integer> arr){
        int n = arr.size();
        int mid = n /2;
        int leftsum = 0;
        int rightsum = 0;

        for(int i=0; i<mid; i++){
            leftsum += arr.get(i);
        }

        for(int i=mid; i<n; i++){
            rightsum += arr.get(i);
        }
        return Math.abs(leftsum - rightsum);
    }
}