//You are given an array of integers, your task is to divide
//the array into two sub-arrays (left and right) containing half
//of the array elements. Find the sum of the subarrays and then
//return the multiply of both the subarrays.
//
//Note: If the length of the array is odd then the right half will
//contain one element more than the left half.

public class left_right_sum{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int result = sumarray(arr);
        System.out.println("output: " +result);
    }
    public static int sumarray(int[] arr){
        int n = arr.length;
        int mid = n /2;
        int leftsum = 0;
        int rightsum = 0;

        for(int i=0; i<n; i++){
            if(i<mid){
                leftsum += arr[i];
            }
            else{
                rightsum += arr[i];
            }
        }
        return leftsum * rightsum;
    }
}