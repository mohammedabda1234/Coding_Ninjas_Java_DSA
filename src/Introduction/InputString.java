package Introduction;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word");
        String str = s.next();// to one word
        System.out.println(str);
        System.out.println("Enter line of String");
        String str1 = s.nextLine();// to end of line
        System.out.println(str1);
    }
}
