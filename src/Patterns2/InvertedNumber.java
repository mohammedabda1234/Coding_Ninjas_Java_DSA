package Patterns2;

import java.util.Scanner;

public class InvertedNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i <= n){
            int j = 1;
            while (j <= n - i + 1){
                System.out.print(n - i + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
