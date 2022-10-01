package DynamicProgramming2;

public class LCS {
    public static int Lcs(String str1, String str2, int i, int j) {
        if (i == str1.length() || j == str2.length()){
            return 0;
        }
        int myAns ;
        if (str1.charAt(i) == str2.charAt(j)){
            int small = Lcs(str1,str2,i+1,j+1);
            myAns = 1 + small;
        }else {
            int ans1 = Lcs(str1,str2,i+1,j);
            int ans2 = Lcs(str1,str2,i,j+1);
            myAns = Math.max(ans1,ans2);
        }
        return myAns;
    }
    public static int Lcs(String str1,String str2,int i,int j,int[][] dp){
        if (i == str1.length() || j == str2.length()){
            return 0;
        }
        int myAns ;
        if (str1.charAt(i) == str2.charAt(j)){
            int small ;
            if (dp[i+1][j+1] == -1) {
               small =   Lcs(str1, str2, i + 1, j + 1,dp);
               dp[i+1][j+1] = small;
            }else {
                small = dp[i+1][j+1];
            }
            myAns = 1 + small;
        }else {
            int ans1,ans2;
            if (dp[i+1][j] == -1) {
                ans1 = Lcs(str1, str2, i + 1, j,dp);
                dp[i+1][j] = ans1;
            }else {
                ans1 = dp[i+1][j];
            }
            if (dp[i][j+1] == -1) {
                ans2 = Lcs(str1, str2, i, j + 1,dp);
                dp[i][j+1] = ans2;
            }else {
                ans2 = dp[i][j+1];
            }
            myAns = Math.max(ans1,ans2);
        }
        return myAns;
    }
    public static void main(String[] args) {
        String str1 = "debgmc";
        String str2 = "adbfglc";
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = Lcs(str1,str2,0,0,dp);
        System.out.println(ans);
    }
}
