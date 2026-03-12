public class Findprodmaxmin{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,50};
        int[] arr2 = {10,20,30,40,50};
        long result = findprod(arr1, arr2);
        System.out.println("The product is: " +result);
    }
    public static long findprod(int[] arr1, int[] arr2){
        int max = arr1[0];
        int min = arr2[0];

        for(int num : arr1){
            if(num > max){
                max = num;
            }
        }
        for(int num : arr2){
            if(num < min){
                min = num;
            }
        }
        return (long) max * min;
    }
}