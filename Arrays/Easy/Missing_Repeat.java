import java.util.ArrayList;

public class Missing_Repeat {
    public static void main(String[] args){
        int[] arr = {2,2};
        System.out.println("The repeating and missing elements are: " +findresult(arr));
    }
    public static ArrayList<Integer> findresult(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();

        int repeating = -1;
        int missing = -1;

        for(int i=0; i<arr.length; i++){
            int absVal = Math.abs(arr[i]);
            int index = absVal - 1;

            if(arr[index] < 0){
                repeating = absVal;
            }else{
                arr[index] = -arr[index];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                missing = i + 1;
                break;
            }
        }
        result.add(repeating);
        result.add(missing);
        return  result;
    }
}