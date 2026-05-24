//Ram and Rohan are participating in a tournament where they must compete against contenders whose strengths are given in an array arr[]. Ram's strength is m, and Rohan's strength is n. They take turns competing against the contenders, with Ram always going first. A contender is defeated if their strength is an exact multiple of either Ram's or Rohan's strength. Once defeated, a contender cannot compete again.
//
//Determine who wins more matches: Ram or Rohan. If both win the same number of matches, declare both as winners.
//
//        Examples:
//
//Input: arr[] = [4, 5, 7, 6, 9, 10, 14], m = 2, n = 3
//Output: "Ram"
//Explanation: Ram wins against contenders with strengths [4, 6, 10, 14]. Rohan wins against the contender with strength [9].
//Input: arr[] = [1, 9, 9, 10, 9, 18], m = 5, n = 3
//Output: "Rohan"
//Explanation: Ram wins against the contender with strength [10]. Rohan wins against contenders with strengths [9, 9, 9, 18].

public class Face_off_tournament {
    public static void main(String[] args){
        int[] arr = {4, 5, 7, 6, 9, 10, 14};
        int m = 2;
        int n = 3;
        System.out.println("The winner is : " +winner(arr,m,n));
    }
    public static String winner(int[] arr, int m , int n){
        int ram = 0;
        int rohan = 0;

        for(int num : arr){
            if(num % m == 0){
                ram++;
            }else if(num % n == 0){
                rohan++;
            }
        }
        if(ram > rohan){
            return "Ram";
        }else if(rohan > ram){
            return "Rohan";
        }else{
            return "Both";
        }
    }
}