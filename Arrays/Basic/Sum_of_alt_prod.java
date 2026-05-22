import java.util.Arrays;

public class Sum_of_alt_prod {
    public static void main(String[] args){
        int[] arr = {9, 2, 8, 4, 5, 7, 6, 0};
        System.out.println("The sum of all alternate numbers are: " +altproduct(arr));
    }
    public static int altproduct(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int totalSum = 0;

        for(int i=0; i<n/2; i++){
            int startElement = arr[i];
            int endElement = arr[n-1-i];

            totalSum += (startElement * endElement);
        }
        return totalSum;
    }
}