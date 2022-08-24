package Function;

import java.util.Scanner;

public class NCR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int FactN = 1;
        for (int i = 1; i <= n ; i++) {
            FactN = FactN * i;
        }
        int FactR = 1;
        for (int i = 1; i <= r; i++) {
            FactR = FactR * i;
        }
        int FactNR = 1;
        for (int i = 1; i <= n - r ; i++) {
            FactNR = FactNR * i;
        }
        int result = FactN /(FactR * FactNR);
        System.out.println(result);
    }
}
