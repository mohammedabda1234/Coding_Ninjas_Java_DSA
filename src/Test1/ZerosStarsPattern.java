package Test1;

import java.util.Scanner;

public class ZerosStarsPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int k,l;
        for(k=1;k<=n;k++){
            for(l=1;l<=n;l++){
                if(k==l)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            l--;
            System.out.print("*");
            while(l>=1){
                if(k==l)
                    System.out.print("*");
                else
                    System.out.print("0");
                l--;
            }
            System.out.println();
        }
    }
}
