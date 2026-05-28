public class Stable_Sort {
    public static void main(String[] args){
        int[] arr = {3, 4, 3, 5, 2, 3, 4, 3, 1, 5};
        int k = 5;
        System.out.println("The index : " +getindex(arr,k));
    }
    public static int getindex(int[] arr , int k){
        int targetvalue = arr[k];
        int finalposition = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < targetvalue){
                finalposition++;
            }
            else if(arr[i] == targetvalue && i < k){
                finalposition++;
            }
        }
        return finalposition;
    }
}