package Patterns2;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print(' ');
                j++;
            }
            int k =1;
            while (k <= n){
                System.out.print('*');
                k++;
            }
            System.out.println('*');
            i++;
        }
    }
}
