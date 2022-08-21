package Patterns2;

import java.util.Scanner;

public class MirrorImage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i <= n) {
            int space = 1;
            while (space <= n - i) {
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while (star <= i){
                System.out.print('*');
                star++;
            }
            System.out.println();
            i++;
        }
    }
}