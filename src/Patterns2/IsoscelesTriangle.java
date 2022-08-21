package Patterns2;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i <= n){
            int space = 1;
            while (space <= n - i){
                System.out.print(' ');
                space++;
            }
            int num = 1;
            while (num <= i){
                System.out.print(num);
                num++;
            }
            int dec = i - 1;
            while (dec >= 1){
                System.out.print(dec);
                dec --;
            }
            System.out.println();
            i++;
        }
    }
}
