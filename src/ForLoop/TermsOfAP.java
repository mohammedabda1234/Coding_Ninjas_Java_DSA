package ForLoop;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 1,i = 1,sum;
        int n =s.nextInt();
        while (x<= n && x <= 10000){
            sum = (3 * i )+2;
            if (sum % 4 != 0){
                System.out.println(sum +" ");
                x++;
            }
            i++;
        }

    }
}
