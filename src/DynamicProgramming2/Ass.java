package DynamicProgramming2;

public class Ass {
    public static int findMaxSquareWithAllZeros(int[][] input){
        int m=input.length;
        if (m==0)
            return 0;
        int n=input[0].length;
        if (n==0)
            return 0;

        int[][] dp = new int[m][n];
        int maxVal=0;

        for (int i=0;i<n;i++)
        {
            if (input[0][i]==0)
            {
                dp[0][i]=1;
            }
        }

        for (int i=0;i<m;i++)
        {
            if (input[i][0]==0)
            {
                dp[i][0]=1;
            }
        }
        for (int i=1;i<m;i++)
        {
            for (int j=1;j<n;j++)
            {
                if(input[i][j]==0)
                {
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    int ans3=dp[i-1][j-1];

                    dp[i][j]=Math.min(ans1,Math.min(ans2,ans3))+1;
                }
                if (dp[i][j]>maxVal)
                    maxVal=dp[i][j];
            }
        }
        return maxVal;
    }
    public static int smallestSuperSequence(String str1, String str2) {

        int n1=str1.length();
        int n2=str2.length();

        int[][] dp = new int[n1+1][n2+1];
        for (int i=n1;i>=0;i--)
        {
            dp[i][n2]=n1-i;
        }
        for (int i=n2;i>=0;i--)
        {
            dp[n1][i]=n2-i;
        }

        for (int i=n1-1;i>=0;i--)
        {
            for (int j=n2-1;j>=0;j--)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    dp[i][j]=dp[i+1][j+1]+1;
                }
                else
                {
                    int ans1=dp[i+1][j];
                    int ans2=dp[i][j+1];

                    dp[i][j]=Math.min(ans1,ans2)+1;
                }
            }
        }
        return dp[0][0];
    }
    public static int getMinimumStrength(int[][] grid) {

        int row=grid.length;
        if (row==0)
            return row;

        int col=grid[0].length;
        if (col==0)
            return col;

        int[][] dp=new int[row][col];
        dp[row-1][col-1]=1;

        for (int i=col-2;i>=0;i--)
        {
            dp[row-1][i]=dp[row-1][i+1]-grid[row-1][i];

        }
        for (int i=row-2;i>=0;i--)
        {
            dp[i][col-1]=dp[i+1][col-1]-grid[i][col-1];
        }

        for(int i=row-2;i>=0;i--)
        {
            for (int j=col-2;j>=0;j--)
            {
                int ans1=dp[i+1][j];
                int ans2=dp[i][j+1];

                dp[i][j]=Math.max(1,Math.min(ans1,ans2)-grid[i][j]);
            }
        }
        return dp[0][0];
    }
    static boolean isSubsetPresent(int[] set, int n, int sum) {
        boolean subset[][] = new boolean[sum + 1][n + 1];
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;
        // Fill the subset table in bottom
        // up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1])
                    subset[i][j] = subset[i][j]
                            || subset[i - set[j - 1]][j - 1];
            }
        }
        return subset[sum][n];
    }
    public static void main(String[] args) {

    }
}
