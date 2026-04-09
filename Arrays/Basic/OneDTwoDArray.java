import java.util.ArrayList;


public class OneDTwoDArray {
    public static void main(String[] args){
        int[][] arr = {{1,1,1}, {2,2,2}, {3,3,3}};
        int[] brr = {2,43,5,6};
        int n = 3;

        System.out.println("The result is " +sumandmax(arr, brr, n));
    }

    public static ArrayList<Integer> sumandmax(int[][] arr , int[] brr , int n){
        ArrayList<Integer> result = new ArrayList<>();

        int diagonalsum = 0;
        for(int i=0; i<n; i++){
            diagonalsum += arr[i][i];
        }

        int max = 0;
        for(int i=0; i<brr.length; i++){
            if(brr[i] > max){
                max = brr[i];
            }
        }

        result.add(diagonalsum);
        result.add(max);

        return result;
    }
}