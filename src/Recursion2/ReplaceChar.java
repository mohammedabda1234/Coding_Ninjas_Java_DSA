package Recursion2;

public class ReplaceChar {
    public static String replace(String str ,char a,char b){
        if (str.length() == 0){
            return str;
        }
        String smallOutput = replace(str.substring(1),a,b);
        if (str.charAt(0) == a){
            return b+smallOutput;
        }
        else {
            return str.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(replace("hello",'l','h'));
    }
}
