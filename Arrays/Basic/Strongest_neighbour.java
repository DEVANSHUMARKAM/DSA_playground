import java.util.*;

public class Strongest_neighbour{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5};
        ArrayList<Integer> result1 = new ArrayList<>();
        result1 = maxadj(arr);
        System.out.println(" "+result1);
    }
    public static ArrayList<Integer> maxadj(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            int winner = Math.max(arr[i] , arr[i+1]);
            result.add(winner);
        }
    return result;
    }
}