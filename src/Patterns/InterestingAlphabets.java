package Patterns;

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
