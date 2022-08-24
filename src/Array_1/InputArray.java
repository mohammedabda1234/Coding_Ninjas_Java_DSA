package Array_1;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array Element number "+(i+1));
            arr[i] = s.nextInt();
        }
        System.out.println("Array element are ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
