import java.util.Arrays;
import java.util.TreeSet;


public class DistinctDigitsArray {
    public static void main(String[] args){
        int[] nums = {111, 222, 333, 4444, 666};
        int[] output = common_digits(nums);
        System.out.println("The result is : " +Arrays.toString(output));
    }

    public static int[] common_digits(int[] nums){
        TreeSet<Integer> distinctDigits = new TreeSet<>();

        for(int n : nums){
            if(n == 0){
                distinctDigits.add(0);
                continue;
            }

            int temp =n;
            while(temp > 0){
                int digit = temp % 10;
                distinctDigits.add(digit);
                temp /= 10;
            }
        }
        int result[] = new int[distinctDigits.size()];
        int index = 0;
        for(int d : distinctDigits){
            result[index++] = d;
        }
        return result;
    }
}