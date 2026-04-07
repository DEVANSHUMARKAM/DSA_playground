import java.util.ArrayList;
import java.util.Arrays;

public class AltPosNeg{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, -3, -4, -5, 10));
        ArrayList<Integer> output = arranged(arr);
        System.out.println(output);
    }
    public static ArrayList<Integer> arranged(ArrayList<Integer> arr){
        int n = arr.size();
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int num : arr){
            if(num < 0){
                negative.add(num);
            }else{
                positive.add(num);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<positive.size(); i++){
            result.add(positive.get(i));
            result.add(negative.get(i));
        }
        return result;
    }
}