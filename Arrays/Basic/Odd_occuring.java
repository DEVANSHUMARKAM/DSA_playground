public class Odd_occuring{
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,3};
        int output = count(arr);
        System.out.println("Result: " +output);
    }
    public static int count(int[] arr){
        int result = 0;
        for(int num : arr){
            result = result ^ num;
        }
        return result;
    }
}