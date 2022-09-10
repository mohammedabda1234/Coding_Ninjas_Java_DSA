package Test1DSA;

import java.util.Arrays;

public class Code {
    public static boolean checkSequence(String a, String b) {
        return checkSequence(a,b,0,0);
    }
    public static boolean checkSequence(String a, String b, int a_idx, int b_idx)
    {
        if (b_idx==b.length())
        {
            return true;
        }
        if (a_idx==a.length())
        {
            return false;
        }
        if (b.charAt(b_idx)==a.charAt(a_idx))
        {
            return checkSequence(a,b,a_idx+1,b_idx+1);
        }
        else
        {
            return checkSequence(a,b,a_idx+1,b_idx);
        }
    }
    public static int maximumProfit(int budget[]) {
        Arrays.sort(budget);
        int ans=Integer.MIN_VALUE;
        int n=budget.length;

        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,budget[i]*(n-i));
        }
        return ans;
    }

    public static boolean splitArray(int input[]) {

        return splitArray(input,0,0,0);
    }

    public static boolean splitArray(int arr[], int si, int lsum, int rsum)
    {

        if (si == arr.length)
        {
            return lsum == rsum;
        }

        if (arr[si] % 5 == 0)
        {
            lsum += arr[si];
        }
        else if (arr[si] % 3 == 0)
        {
            rsum += arr[si];
        }
        else
        {
            return splitArray(arr,si+1, lsum+arr[si], rsum)  || splitArray(arr,si+1,lsum,rsum+arr[si]);
        }

        return splitArray(arr,si+1,lsum,rsum);
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(checkSequence(str,"wor"));
    }
}
