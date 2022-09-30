package DynamicProgramming1;

import java.util.Scanner;

public class Fibonacci {
    public static int fibb(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int ans1 = fibb(n -1);
        int ans2 = fibb(n -2);
        return ans2 + ans1;
    }
    public static int fib(int n,int[] dp){
        if (n == 0 || n ==1){
            return n;
        }
        int ans1,ans2;
        if (dp[n-1] == -1){
            ans1 = fib(n-1,dp);
            dp[n-1] = ans1;
        }else {
            ans1 = dp[n-1];
        }
        if (dp[n-2] == -1){
            ans2 = fib(n-2,dp);
            dp[n-2] = ans2;
        }else {
            ans2 = dp[n-2];
        }
        return ans2 + ans1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(fib(n,dp));
    }
}
