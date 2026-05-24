//Geek is given a task to select at most 10 employees for a company project. Each employee is represented by a single-digit ID number which is unique for all the selected employees for the project. Geek has a technical problem in his system which printed ID number multiple times. You are given array arr having all printed IDs. Help him to get rid of the repeated IDs.
//
//        Examples:
//
//Input: arr[] = [8, 8, 6, 2, 1]
//Output: [8, 6, 2, 1]
//Explanation: 8 is repeated, so takes 8 single time.
//Input: arr[] = [7, 6, 7, 4, 2, 7]
//Output: [7, 6, 4, 2]
//Explanation: 7 is repeated, so takes 7 single time.
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class Repeated_ID {
    public static void main(String[] args){
        int arr[] = {8, 8, 6, 2, 1};
        System.out.println("After removing repeated ID's : " +uniqueID(arr));
    }

    public static ArrayList<Integer> uniqueID(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int num : arr){
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}