package Recurion1;

public class Sum {
    public static int sum(int[] arr,int n){
        if (n == 0){
            return 0;
        }
        return (sum(arr,n-1)+arr[n - 1]);
    }

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input,x,0);
    }
    private static boolean checkNumber(int input[],int x,int startIndex){
        if(startIndex==input.length)
            return false;
        if(input[startIndex]==x)
            return true;
        return checkNumber(input,x,startIndex+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sum(arr,arr.length ));
//        System.out.println(sum(arr));
        System.out.println(checkNumber(arr,2));
    }

//    public static int sum(int input[]) {
//        return sum1(input,0);
//
//    }
//    private static int sum1(int input[],int startIndex){
//        if(startIndex==input.length)
//            return 0;
//        int ans=input[startIndex]+sum(input,startIndex+1);
//        return ans;

//    }
}
