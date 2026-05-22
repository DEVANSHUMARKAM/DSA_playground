public class Reducing_walls {
    public static void main(String[] args){
         int[] arr = {2,5,3,5,2,12};
         int k = 2;
         System.out.println("The total operations are: " +reducingwalls(arr,k));
    }

    public static int reducingwalls(int[] arr, int k){
        int totalOperatios = 0;
        for(int num : arr){
            if(num > k){
                totalOperatios += (num - 1) / k;
            }
        }
        return totalOperatios;
    }
 }