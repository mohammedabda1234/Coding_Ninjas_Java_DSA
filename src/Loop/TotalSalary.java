package Loop;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int bs = s.nextInt();
        String str = s.next();
        char g = str.charAt(0);
        int all ;
        if (g == 65)
            all = 1700;
        if (g == 66)
            all = 1500;
        else
            all = 1300;
        double ts=((bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs));
        double p=Math.round(ts);
        int h=(int)(p);
        System.out.println(h);
    }
}
