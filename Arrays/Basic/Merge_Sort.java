import java.util.TreeSet;
import java.util.ArrayList;

public class Merge_Sort {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,5,8,9,0};

        System.out.println("Result after merging and sorting: " +mergeSort(arr1, arr2));

    }
    public static ArrayList<Integer> mergeSort(int[] arr1, int[] arr2){

        TreeSet<Integer> set = new TreeSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}