package DynamicProgramming2;

public class Knap {
    public static int knapsack(int w, int[] val, int[] wt, int i) {
        if (i == val.length){
            return 0;
        }
        int ans ;
        if (wt[i] <= w ){
            int ans1 = val[i] + knapsack(w-wt[i],val,wt,i+1);
            int ans2 = knapsack(w,wt,val,i+1);
            ans = Math.max(ans1,ans2);
        }else {
            ans = knapsack(w,val,wt,i+1);
        }
        return ans;
    }
    public static int knapsack(int W,int[] val,int[] wt){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for (int i = n-1; i >= 0 ; i--) {
            for (int w = 0; w <= W; w++) {
                int ans ;
                if (wt[i] <= w){
                    int ans1 = val[i] + dp[i+1][w-wt[i]];
                    int ans2 = dp[i+1][w];
                    ans = Math.max(ans1,ans2);
                }else {
                    ans =dp[i+1][w];
                }
                dp[i][w] = ans;
            }
        }
        return dp[0][W];
    }
    public static int countWaysToMakeChange(int Coins[], int value){
        int[] ways = new int[value + 1];
        // Set the first way to 1 because its 0 and
        // there is 1 way to make 0 with 0 coins
        ways[0] = 1;
        // Go through all of the coins
        for (int i = 0; i < Coins.length; i++) {
            // Make a comparison to each index value
            // of ways with the coin value.
            for (int j = 0; j < ways.length; j++) {
                if (Coins[i] <= j) {
                    // Update the ways array
                    ways[j] += ways[(int)(j - Coins[i])];
                }
            }
        }
        // return the value at the Nth position
        // of the ways array.
        return ways[value];
    }

    public static void main(String[] args) {
        int[] val = {200,300,100};
        int[] wt = {20,25,30};
        int w = 50;
        int ans = knapsack(w,val,wt);
        System.out.println(ans);
    }
}
