import java.util.ArrayList;
import java.util.Arrays;
class Alternate{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> output = solution(arr);
        System.out.println(output);

    }
    public static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i=i+2){
            result.add(arr[i]);
        }
        return result;
    }
}