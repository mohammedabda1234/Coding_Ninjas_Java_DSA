package TimeComplexity;

public class Equilibrium {
    public static int arrayEquilibriumIndex(int[] arr){
        int i, j;
        int leftsum, rightsum;
        int n = arr.length;
        for (i = 0; i < n; ++i) {
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += arr[j];
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,1,1,1};
        System.out.println(arrayEquilibriumIndex(arr));
    }
}
