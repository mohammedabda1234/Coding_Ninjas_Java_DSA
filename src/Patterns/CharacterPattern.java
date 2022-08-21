package Patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i <= n){
            int j = 1;
            char ch = (char) ('A' + i - 1);
            while (j <= i){
                System.out.print(ch);
                j++;
                ch++;
            }
            System.out.println();
            i++;
        }
    }
}
