package ForLoop;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = num - 1; i >= 0 ; i--) {
            int n = num >> i;
            if ((n & 1)>0){
                System.out.print("1");
            }
            else
                System.out.print("0");
        }
    }
}
