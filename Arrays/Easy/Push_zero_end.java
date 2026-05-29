public class Push_zero_end {
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushzeroend(arr);
        System.out.println("The result after removing all zeros to end : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    public static void pushzeroend(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < n){
            arr[count] = 0;
            count++;
        }
    }
}