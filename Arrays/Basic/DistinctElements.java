import java.util.HashSet;

public class DistinctElements
{
    public static void main(String[] args){
        int[] arr = {1,1,1,2,3,2};
        System.out.println("The sum of distint elemnt is: " +findsum(arr));
    }

    public  static int findsum(int[] arr){
        HashSet<Integer> seen = new HashSet<>();

        int sum =0;
        for(int num : arr){
            if(seen.add(num)){
                sum += num;
            }
        }
        return sum;
    }
}