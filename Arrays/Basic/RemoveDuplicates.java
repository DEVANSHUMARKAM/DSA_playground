import java.util.LinkedHashSet;
import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,5};
        ArrayList<Integer> result = remove(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> remove(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num : arr){
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}