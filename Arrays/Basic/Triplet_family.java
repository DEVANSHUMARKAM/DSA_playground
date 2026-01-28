import java.util.Arrays;

public class Triplet_family{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Boolean result = find(arr);
        System.out.println(result);
    }
    public static boolean find(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=n-1; i >=2; i--){
            int target = arr[i];
            int left = 0;
            int right = i -1;

            while(left < right){
                int currentsum = arr[left] + arr[right];
                if(currentsum == target){
                    return true;
                }else if(currentsum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}