import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Move_to_front {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 7, 4, 3, 2, 6, 1));
        System.out.println("Minimum moves: " +minmove(arr));
    }

    public static int minmove(ArrayList<Integer> arr){
        int n = arr.size();

        int expected = n;

        for(int i=n-1; i>=0; i--){
            if(arr.get(i) == expected){
                expected--;
            }
        }
        return expected;
    }
}