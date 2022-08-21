package Patterns2;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i <= n){
            int j = 1;
            while (j <= n -i + 1){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
