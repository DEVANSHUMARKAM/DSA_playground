import java.util.Arrays;
import java.util.Collections;

public class Max_Parm_Tri {
    public static void main(String[] args){
        int[] arr = {6, 1, 6, 5, 8, 4};
        System.out.println("Max parameter is : " +findparam(arr));
    }
    public static int findparam(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=n-1; i>=2; i--){
            int c = arr[i];
            int b = arr[i-1];
            int a = arr[i-2];
        if(a+b > c){
            return a + b + c;
        }
        }
        return -1;
    }
}