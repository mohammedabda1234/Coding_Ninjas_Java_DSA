package DynamicProgramming1;

import java.util.HashMap;

public class Long {
    public static long bytelandian(long n, HashMap<java.lang.Long, java.lang.Long> memo) {
        if (n<12)
        {
            memo.put(n,n);
            return n;
        }
        if (!memo.containsKey(n))
        {
            long ans1=bytelandian(n/2,memo);
            long ans2=bytelandian(n/3,memo);
            long ans3=bytelandian(n/4,memo);

            long currVal=ans1+ans2+ans3;
            if (currVal>n)
                memo.put(n,currVal);
            else
                memo.put(n,n);
        }
        return memo.get(n);
    }
    public static int maxMoneyLooted(int[] houses) {

        if (houses.length==0)
            return 0;

        if (houses.length==1)
            return houses[0];

        if (houses.length==2)
            return Math.max(houses[0],houses[1]);

        int n = houses.length;
        int[] dp = new int[n];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0],houses[1]);

        for (int i=2;i<n;i++)
        {
            int maxVal1=dp[i-2]+houses[i];


            int maxVal2=dp[i-1];


            dp[i]=Math.max(maxVal1,maxVal2);
        }


        return dp[n-1];

    }

    public static String findWinner(int n, int x, int y) {

        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for (int i=2;i<=n;i++)
        {

            if (dp[i-1]==0)
            {
                dp[i]=1;
            }
            else if ((i-x)>=0 && dp[i-x]==0)
            {
                dp[i]=1;
            }
            else if ((i-y)>=0 && dp[i-y]==0)
            {
                dp[i]=1;
            }
            else
            {
                dp[i]=0;
            }

        }

        if (dp[n]==1)
            return "Beerus";
        else
            return "Whis";
    }
    public static void main(String[] args) {

    }
}
