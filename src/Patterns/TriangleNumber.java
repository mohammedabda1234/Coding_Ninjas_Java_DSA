package Patterns;

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i<=n){
            int j = 1;
            while (j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
