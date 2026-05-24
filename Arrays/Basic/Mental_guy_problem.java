//A person needs to reach home by train but compulsively switches trains at every station. If they start with train arr1 at the first station, they will switch to train arr2 at the next station, and then switch back to train arr1 at the following station, and so on. Similarly, if they start with train arr2, they will switch to train arr1 at the next station, and continue alternating.
//Given two arrays, arr1 and arr2, where:
//arr1[i] represents the time taken by train arr1 at station i.
//arr2[i] represents the time taken by train arr2 at station i.
//Determine the minimum total time required to reach home starting from either train arr1 or train arr2, with the switching pattern maintained.
//        Examples:
//Input: arr1 = [2, 1, 2], arr2 = [3, 2, 1]
//Output: 5
//Explanation: Starting with train arr2 yields the minimum total time of 5.
//Input: arr1 = [1, 3, 1, 2] arr2 = [2, 2, 3, 1]
//Output: 5
//Explanation: Starting with train arr1 yields the minimum total time of 5.

public class Mental_guy_problem {
    public static void main(String[] args){
        int[] arr1 = {2, 1, 2};
        int[] arr2 = {3, 2, 1};
        System.out.println("The minimum time is : " +minTime(arr1, arr2));
    }

    public static int minTime(int[] arr1, int[] arr2){
        int n = arr1.length;

        if(n == 0){
            return 0;
        }

        int pathA = 0;
        int pathB = 0;

        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                pathA += arr1[i];
                pathB += arr2[i];
            }else{
                pathA += arr2[i];
                pathB += arr1[i];
            }
        }
        return Math.min(pathB, pathA);
    }
}