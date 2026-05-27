//Given an array, write a program to construct a triangle where the last row contains elements of the given array, every element of the second last row contains the sum of the below two elements with modulo 10 9+7, and so on.
//
//        Examples:
//
//Input: arr[] = [4, 7, 3, 6, 7]
//Output: [81, 40, 41, 21, 19, 22, 11, 10, 9, 13, 4, 7, 3, 6, 7]
//Explanation:
//        81
//        40  41
//        21  19  22
//        11  10   9   13
//        4   7   3   6    7
//Input: arr[] = [1, 2, 4]
//Output: [9, 3, 6, 1, 2, 4]
//Explanation:
//        9
//        3   6
//        1  2  4
import java.util.List;
import java.util.ArrayList;

public class Sum_triangle {
    public static void main(String[] args){
        int[] arr = {4, 7, 3, 6, 7};
        System.out.println("The result : " +getTriangle(arr));
    }

    public static ArrayList<Integer> getTriangle(int[] arr){
        int MOD = 1000000007;

        List<List<Integer>> triangleRows = new ArrayList<>();

        List<Integer> currentLevel = new ArrayList<>();
        for(int x : arr) currentLevel.add(x);
        triangleRows.add(new ArrayList<>(currentLevel));

        while(currentLevel.size() > 1){
            List<Integer> nextLevel = new ArrayList<>();
            for(int i=0; i<currentLevel.size()-1; i++){

                long sum = (long) currentLevel.get(i) + currentLevel.get(i+1);
                nextLevel.add((int)(sum % MOD));
            }
            triangleRows.add(nextLevel);
            currentLevel = nextLevel;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=triangleRows.size() - 1; i >= 0; i--){
            result.addAll(triangleRows.get(i));
        }
        return result;
    }
}