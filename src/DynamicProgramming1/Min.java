package DynamicProgramming1;

public class Min {
    public static int minSquare(int n,int[] dp){
        if (n == 0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int current;
            if (dp[n-(i*i)] == -1) {
                current = minSquare(n - (i * i), dp);
                dp[n - (i * i)] = current;
            }else {
                current = dp[n - (i*i)];
            }
                if (min > current) {
                    min = current;
                }

        }
        return min+1;
    }
    public static void main(String[] args) {
        int n = 41;
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        System.out.println(minSquare(n,dp));
    }
}
