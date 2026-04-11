public class LastDuplicate {
    public static void main(String[] args){
        int[] arr = {1, 5, 5, 6, 6, 7};
        int[] result = duplicateIndex(arr);
        for(int i=0; i<result.length; i++){
        System.out.print(result[i] + " ");
        }
        System.out.println();

    }

    public static int[] duplicateIndex(int[] arr){
        int n = arr.length;

        for(int i=n-1; i>0; i--){
            if(arr[i] == arr[i-1]){
                return new int[]{i,arr[i]};
            }
        }
        return new int[]{-1,-1};
    }
}