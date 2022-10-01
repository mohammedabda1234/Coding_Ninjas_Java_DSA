package DynamicProgramming2;

public class Knap {
    public static int knapSak(int w, int[] val, int[] wt, int i) {
        if (i == val.length){
            return 0;
        }
        int ans ;
        if (wt[i] <= w ){
            int ans1 = val[i] + knapSak(w-wt[i],val,wt,i+1);
            int ans2 = knapSak(w,wt,val,i+1);
            ans = Math.max(ans1,ans2);
        }else {
            ans = knapSak(w,val,wt,i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] val = {200,300,100};
        int[] wt = {20,25,30};
        int w = 50;
        int ans = knapSak(w,val,wt,0);
        System.out.println(ans);
    }
}
