import java.lang.Math;
import java.util.ArrayList;

public class AbsoluteDifferenceOne {
    public static void main(String[] args){
        int[] arr = {7, 98, 56, 43, 45, 23, 12, 8};
        int k = 54;
        System.out.println("The result is: " +getdifference(arr, k));
    }

    public static ArrayList<Integer> getdifference(int[] arr , int k){
        ArrayList<Integer> result = new  ArrayList<>();

        for(int num : arr){
            if(num < k && ( num >= 10 || num <= -10)){
                if(hashAdjacentDiffOne(Math.abs(num))){
                    result.add(num);
                }
            }
        }
        return result;
    }

    public static boolean hashAdjacentDiffOne(int n){
        int lastdigit = n % 10;
        n /= 10;

        while(n > 0){
            int currentdigit = n % 10;

            if(Math.abs(lastdigit - currentdigit) != 1){
                return false;
            }
            lastdigit = currentdigit;
            n /= 10;
        }
        return true;
    }
}