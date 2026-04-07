import java.util.Arrays;
import java.util.ArrayList;


public class CountElements{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,4,5,1,6,22));
        int num1 = 5;
        int num2 = 22;
        int result = getcount(arr,num1,num2);
        System.out.println(result);
    }
    public static int getcount(ArrayList<Integer> arr, int num1, int num2){
        int n = arr.size();
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i=0; i<n; i++){
            if(arr.get(i) == num1){
                firstIndex = i;
                break;
            }
        }

        for(int j=n-1; j>=0; j--){
            if(arr.get(j) == num2){
                lastIndex = j;
                break;
            }
        }
        if (firstIndex != -1 && lastIndex != -1 && firstIndex < lastIndex) {
            return lastIndex - firstIndex - 1;
        }
        return 0;
    }
}