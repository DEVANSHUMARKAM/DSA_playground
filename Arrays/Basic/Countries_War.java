//The two countries of A and B are at war against each other. The power of these soldiers is given by arr1[i] of A and arr2[i] of B. They can only attack their counterpart enemies like arr1[i] can attack only arr2[i] and not anyone else. Both countries have equal number of counterparts. A soldier with a higher power can kill the enemy soldier. If both soldiers have the same power, they both die. You need to find the winning country.
//        Note: If no one winning, then return "DRAW".
//
//Examples:
//
//Input: arr1[] = [2, 2], arr2[] = [5, 5]
//Output: B
//Explanation: Both countries have 2 soldiers. arr2[0] kills arr1[0], arr2[1] kills arr1[1]. A has 0 soldiers alive at the end. B has both soldiers alive at the end.Return "B" as a winner.
//        Input: arr1[] = [9], arr2[] = [8]
//Output: A
//Explanation: arr1[0] > arr2[0], So A is the winner.

public class Countries_War {
    public static void main(String[] args){
        int arr1[] = {2,2};
        int arr2[] = {5,5};
        String result = war(arr1, arr2);
        System.out.println("The result fo war: " +result);
    }

    public static String war(int[] arr1, int[] arr2){
        int n = arr1.length;
        int aliveA = n;
        int aliveB = n;

        for(int i=0; i<n; i++){
            if(arr1[i] > arr2[i]){
                aliveB--;
            }else if(arr2[i] > arr1[i]){
                aliveA--;
            }else{
                aliveA--;
                aliveB--;
            }
        }

        if(aliveA > aliveB){
            return "A";
        }else if(aliveB > aliveA){
            return "B";
        }else{
            return "DRAW";
        }
    }
}