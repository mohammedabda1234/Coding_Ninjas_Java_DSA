package DynamicProgramming1;

public class MinStep {
    public static int minStepTo1(int n){
        if (n == 0){
            return 0;
        }
        int ans1 = minStepTo1(n-1);
        int ans2 = Integer.MAX_VALUE ;
        if (n % 2 == 0){
            ans2 = minStepTo1(n/2);
        }
        int ans3 = Integer.MAX_VALUE ;
        if (n % 3 == 0){
            ans3 = minStepTo1(n/3);
        }
        return Math.min(ans1,Math.min(ans2,ans3))+1;
    }
    public static void main(String[] args) {
        System.out.println(minStepTo1(10));
    }
}
