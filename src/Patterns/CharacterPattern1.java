package Patterns;

import java.util.Scanner;

public class CharacterPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int n = s.nextInt();
        while (i <= n){
            int j = 1;
            while (j<=n){
                char ith = (char) ('A' + j - 1);
                System.out.print(ith);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
