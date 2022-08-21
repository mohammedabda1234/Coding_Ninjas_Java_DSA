package Patterns;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = 'A';
        int i = 1;
        int n = s.nextInt();
        while (i<= n){
            int j = 1;
            while (j<= i){
                System.out.print(ch);
                j++;
            }
            System.out.println();
            ch++;
            i++;
        }
    }
}
