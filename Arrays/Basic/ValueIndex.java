import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class ValueIndex{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(15, 2, 45, 4, 7);
        List<Integer> result = solution(nums);

        System.out.println("The values matching their index are: " + result);
    }
    public static List<Integer> solution(List<Integer> nums){
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.size(); i++){
            int val = nums.get(i);
            if(val == i + 1){
                result.add(val);
            }
        }
        return result;
    }
}