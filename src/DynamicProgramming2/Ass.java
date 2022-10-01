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
    public static void main(String[] args) {

    }
}
