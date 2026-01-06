import java.util.List;
import java.util.Arrays;

public class Count_smaller_elements{
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(15, 2, 45, 4, 7);
        int x = 4;
        int result = count(x,arr);
        System.out.println("Result: " +result);

    }
    public static int count(int x , List<Integer> arr){
        int count = 0;
        for(int num : arr){
            if(num <= x){
                count++;
            }
        }
        return count;
    }
}