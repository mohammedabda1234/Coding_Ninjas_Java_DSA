package Introduction;

import java.util.Scanner;

public class CharInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter char");
        char ch  = s.next().charAt(0);
        System.out.println(ch);
    }
}
