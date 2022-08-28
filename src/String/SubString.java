package String;

public class SubString {
    public static void main(String[] args) {
        // substring function that part of string
        String str = "Coding";
        System.out.println(str.substring(1));//her start with length 1;
        System.out.println(str.substring(1,5));//here start with 1 and end with 5;
        String str1 = str.substring(1,6);
        System.out.println(str1.length());//here length of subString
    }
}
