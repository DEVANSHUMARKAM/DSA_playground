public class Palindrome_array{
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1};
        Boolean result = check_palindrome(arr);
        System.out.println("Result: " +result);
    }
    public static boolean check_palindrome(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}