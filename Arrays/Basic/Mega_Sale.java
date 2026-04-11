//Mr. Geek is a greedy seller. He has a stock of some laptops comprising both
// useful and useless laptops. Now, he wants to organize a sale to clear
// his stock of useless laptops. The prices of laptops are arri each consisting of
// positive and negative integers (-ve denoting useless laptops). In a day, he can sell
// almost m laptops. Mr. Geek, a greedy seller, wants to earn maximum profit from this
// sale and sell useless laptops. So, help him maximize his profit by selling useless laptops
//
//
//        Examples:
//
//Input: m = 3, arr[] = [-6, 0, 35, 4]
//Output: 6
//Explanation: Geek sells the laptops with price -6 and earns Rs. 6 as profit.
//Input: m = 2, arr[] = [1, -2, -3, -4, 5]
//Output: 7
//Explanation: Geek sells the laptops with price -3 and -4 and earns Rs. 7 as profit as he can sell max 2 laptops.

import java.util.Arrays;

public class Mega_Sale {
    public static void main(String[] args){
        int[] arr = {1, -2, -3, -4, 5};
        int m = 2;
        System.out.println("The max profit : " +maxProfit(m, arr));
    }

    public static int maxProfit(int m, int[] arr){
        Arrays.sort(arr);

        int totalprofit = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0 && count < m){
                totalprofit += Math.abs(arr[i]);
                count++;
            }
            else if(arr[i] >= 0){
                break;
            }
        }
        return totalprofit;
    }
}