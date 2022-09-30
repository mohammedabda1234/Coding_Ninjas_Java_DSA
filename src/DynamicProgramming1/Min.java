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
    public static int minSquare(int n){
        if (n == 0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                int current = dp[i -(j*j)];
                if (min>current){
                    min =current;
                }
            }
            dp[i] = min+1;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 41;
//        int[] dp = new int[n+1];
//        for (int i = 0; i <= n; i++) {
//            dp[i] = -1;
//        }
        System.out.println(minSquare(n));
    }
}
