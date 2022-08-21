package Patterns2;

import java.util.Scanner;

public class PatternStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n){
            int space = 1;
            while (space <= n -i){
                System.out.print(' ');
                space++;
            }
            int star1 = 1;
            while (star1 <= i){
                System.out.print('*');
                star1++;
            }
            int star2 =i - 1;
            while (star2 >= 1){
                System.out.print('*');
                star2--;
            }
            System.out.println();
            i++;
        }
    }
}
