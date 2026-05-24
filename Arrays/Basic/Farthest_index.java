public class Farthest_index {
    public static void main(String[] args){
        int[] arr = {7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7};
        int x = 7;
        System.out.println("The farthest index where " + x + " lies: " +findfarthest(arr,x));
    }
    public static int findfarthest(int[] arr, int x){
        if(arr == null || arr.length == 0){
            return -1;
        }

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == x){
                return i+1;
            }
        }
        return -1;
    }
}