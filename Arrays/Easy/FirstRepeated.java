import java.util.HashSet;

public class FirstRepeated {
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(findindex(arr));
    }
    public static int findindex(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        int minIndex = -1;

        for(int i=arr.length-1; i>=0; i--){
            if(seen.contains(arr[i])){
                minIndex = i + 1;
            }else{
                seen.add(arr[i]);
            }
        }
        return minIndex;
    }
}