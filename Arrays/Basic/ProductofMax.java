public class ProductofMax{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int result = solution(arr);
        System.out.println("The product of two maxumums is: " +result);
    }
    public static int solution(int[] arr){
        int n = arr.length;
        if(arr == null || arr.length < 0){
            return 0;
        }

        int max1 = -1;
        int max2 = -1;

        for(int num : arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
        }
        return max1 * max2;
    }
}