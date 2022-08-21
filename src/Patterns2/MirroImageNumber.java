package Patterns2;

import java.util.Scanner;

public class MirroImageNumber {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int i = 1;
        int n= s.nextInt();
        while (i <= n){
            int space = 1;
            while (space <= n -i){
                System.out.print(' ');
                space++;
            }
            int number = 1;
            while (number <= i){
                System.out.print(number);
                number++;
            }
            System.out.println();
            i++;
        }
    }
}
