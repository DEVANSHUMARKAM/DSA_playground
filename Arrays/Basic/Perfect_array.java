public class Perfect_array {
    public static void main(String[] args){
        int[] arr = {1, 8, 8, 8, 3, 2};
        System.out.println("The output is : " +isPerfect(arr));
    }

    public static boolean isPerfect(int[] arr){
        int n = arr.length;

        if(n <= 1){
            return true;
        }
        int state = 0;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                if(state > 0){
                    return false;
                }
            }else if(arr[i] == arr[i-1]){
                if(state == 0){
                    state = 1;
                }
                else if(state == 2){
                    return false;
                }
            }else{
                state = 2;
            }
        }
        return true;
    }
}