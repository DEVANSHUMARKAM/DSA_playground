import java.util.ArrayList;
import java.util.HashSet;

public class Union_Array {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        System.out.println("The result after union" +findunion(a,b));
    }
    public static ArrayList<Integer> findunion(int[] a, int[] b){
        HashSet<Integer> unionSet = new HashSet<>();

        for(int num : a){
            unionSet.add(num);
        }
        for(int num : b){
            unionSet.add(num);
        }
        return new ArrayList<>(unionSet);
    }
}