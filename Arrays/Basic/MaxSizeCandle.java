public class MaxSizeCandle {
    public static void main(String[] args){
        int[] arr = {2,2,3,3,4};
        int output = findmaxcandle(arr);
        System.out.println("The maximum days until candle still lit is " +output);

    }

    public static int findmaxcandle(int[] arr){
        if(arr == null || arr.length < 0){
            return 0;
        }
        int maxsizecandle = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxsizecandle){
                maxsizecandle = arr[i];
            }
        }
        return maxsizecandle;
    }
}