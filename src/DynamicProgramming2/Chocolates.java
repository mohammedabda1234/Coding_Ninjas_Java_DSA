package DynamicProgramming2;

public class Chocolates {
    public static int getMin(int a[], int n){
        int i = 0, j = 0;
        int res = 0, val = 1;

        while (j < n - 1) {

            if (a[j] > a[j + 1]) {
                // decreasing sequence
                j += 1;
                continue;
            }

            if (i == j)
                // add the chocolates received by that
                // person
                res += val;
            else {
                // end point of decreasing sequence
                res += get_sum(val, i, j);
                val = 1; // reset value at that index
            }

            if (a[j] < a[j + 1])
                // increasing sequence
                val += 1;
            else
                // flat sequence
                val = 1;

            j += 1;
            i = j;
        }
        // add value of chocolates at position n-1
        if (i == j)
            res += val;
        else
            res += get_sum(val, i, j);

        return res;
    }
    public static int get_sum(int peak, int start, int end)
    {
        int count = end - start + 1;

        peak = (peak > count) ? peak : count;

        int s = peak + (((count - 1) * count) >> 1);

        return s;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,4,6};
        System.out.println(getMin(arr, arr.length-1));
    }
}
