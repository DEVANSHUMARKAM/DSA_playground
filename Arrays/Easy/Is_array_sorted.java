public class Is_array_sorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,65};
        System.out.println("the result : " +isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        if(arr.length <= 1) return true;

        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                return  false;
            }
        }
        return true;
    }
}