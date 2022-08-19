package Introduction;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // name of student
        String name = s.nextLine();
        char ch = name.charAt(0);// we need first char
        // marks of student
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        // average marks
        int avg = (m1 + m2 + m3) / 3;
        System.out.println(ch +"\n"+avg);

    }
}
