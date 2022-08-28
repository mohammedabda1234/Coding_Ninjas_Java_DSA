package String;

import java.util.Scanner;

public class CountWord {
    public static int count(String str){
        int count = 1;
        if (str == null || str.isEmpty()){
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ')&&(str.charAt(i+1)!=' ') ){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(count(str));
    }
}
