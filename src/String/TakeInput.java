package String;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();// to read word;
        String str1 = s.nextLine();//to read complete line
        System.out.println(str +" "+str.length());
        System.out.println(str1 +" "+str1.length());
    }
}
