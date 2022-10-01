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
    public static void main(String[] args) {
        String str1 = "debgmc";
        String str2 = "adbfglc";
        int ans = Lcs(str1,str2,0,0);
        System.out.println(ans);
    }
}
