public class Kth_rotation {
    public static void main(String[] args){
        int[] arr = {6, 9, 12, 15, 2, 4};
        System.out.println("The number of ratations are: " +findkth(arr));
    }

    public static int findkth(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        if(arr[low] <= arr[high]){
            return 0;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(mid < high && arr[mid] > arr[mid+1]){
                return mid + 1;
            }

            if(mid > low && arr[mid] < arr[mid-1]){
                return mid;
            }

            if(arr[mid] >= arr[low]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return 0;
    }
}