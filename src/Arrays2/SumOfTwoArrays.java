package Arrays2;

public class SumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int n = arr1.length;
        int m = arr2.length;
        int p = output.length;

        int i = 0;
        int carry = 0;
        int rem = 0;
        int num = 0;
        while(i < n && i < m) {
            num = arr1[n-i-1] + arr2[m-i-1] + carry;
            rem = num % 10;
            output[p-i-1] = rem;
            carry = num/10;
            i++;
        }

        if(n > m) {
            int j = 1;
            while((n-m-j) >= 0) {
                num = arr1[n-m-j] + carry;
                rem = num % 10;
                output[n-m-j+1] = rem;
                carry = num/10;
                j++;
            }
        }
        else {
            int j = 1;
            while((n-m-j) > 0) {
                num = arr2[n-m-j] + carry;
                rem = num % 10;
                output[n-m-j+1] = rem;
                carry = num/10;
                j++;
            }
        }
        output[0] = carry;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {4,5,7,8,2};
        int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
        sumOfTwoArrays(arr1,arr2,output);
        print(output);
    }
}
