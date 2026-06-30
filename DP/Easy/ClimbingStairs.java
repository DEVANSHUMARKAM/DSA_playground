package DP.Easy;

public class ClimbingStairs {
    public static void main(String[] args){
        int steps = 5;
        int distinctWays = climbing(steps);
        System.out.println("Total distinct ways to climb " + steps + " steps: " + distinctWays);
    }
    public static int climbing(int n){
        if(n <= 0) return 0;
        if(n <= 1) return 1;
        if(n <= 2) return 2;

        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}