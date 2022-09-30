package DynamicProgramming1;

public class MinStep {
    public static int minStepTo1(int n){
        if (n == 0){
            return 0;
        }
        int ans1 = minStepTo1(n-1);
        int ans2 = Integer.MAX_VALUE ;
        if (n % 2 == 0){
            ans2 = minStepTo1(n/2);
        }
        int ans3 = Integer.MAX_VALUE ;
        if (n % 3 == 0){
            ans3 = minStepTo1(n/3);
        }
        return Math.min(ans1,Math.min(ans2,ans3))+1;
    }
    public static int minStepTo1(int n,int[] dp){
        if (n == 1){
            return 0;
        }
        int ans1;
        if (dp[n-1] == -1) {
            ans1 = minStepTo1(n - 1, dp);
            dp[n-1] = ans1;
        }else {
            ans1 = dp[n-1];
        }
        int ans2 = Integer.MAX_VALUE;
        if (n % 2 == 0){
            if (dp[n/2] == -1){
                ans2 = minStepTo1(n/2,dp);
                dp[n/2] = ans2;
            }else {
                  ans2 = dp[n/2];
            }
        }
        int ans3 = Integer.MAX_VALUE;
        if (n % 3 == 0){
            if (dp[n/3] == -1){
                ans3 = minStepTo1(n/3,dp);
                dp[n/3] = ans3;
            }else {
                ans3 = dp[n/3];
            }
        }
        return Math.min(ans1,Math.min(ans2,ans3))+1;
    }
    public static int minStepTo(int n){
        if (n == 1){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            int min = dp[i-1];
            if (i % 2 == 0){
               min = Math.min(min,dp[n/2]);
            }
            if (i % 3 == 0){
               min = Math.min(min,dp[n/3]);
            }
           dp[i] = min+1;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(minStepTo1(n));
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        System.out.println(minStepTo1(n,dp));
        System.out.println(minStepTo(n));
    }
}
