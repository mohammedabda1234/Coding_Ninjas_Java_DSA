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
    public static int Lcs(String str1,String str2){
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = m-1; i >= 0 ; i--) {
            for (int j = n-1; j >= 0 ; j--) {
                int ans;
                if (str1.charAt(i) == str2.charAt(j)){
                    ans = 1 + dp[i+1][j+1];
                }else {
                    int ans1 = dp[i+1][j];
                    int ans2 = dp[i][j+1];
                    ans = Math.max(ans1,ans2);
                }
                dp[i][j] = ans;
            }
        }

        return dp[0][0];
    }

    public static int editDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] storage = new int[m+1][n+1];

        for(int i=0;i<=m;i++) {
            storage[i][0] = i;
        }
        for(int j=0;j<=n;j++) {
            storage[0][j] = j;
        }
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(s1.charAt(m-i) == s2.charAt(n-j)) {
                    storage[i][j] = storage[i-1][j-1];
                }
                else {
                    storage[i][j] = 1 + Math.min(Math.min(storage[i-1][j-1], storage[i-1][j] ), storage[i][j-1] ) ;
                }
            }
        }
        return storage[m][n];
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
        System.out.println(Lcs(str1,str2));
        System.out.println(editDistance(str1,str2));
    }
}
