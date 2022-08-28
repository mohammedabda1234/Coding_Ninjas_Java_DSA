package String;

public class Intro {
    public static void main(String[] args) {
        char[] arr = {'C','o','d','i','n','g'};//equal String str "Coding";
        String str = "Coding";
        String str2 = " is fun";
        String str1 = "";//empty string not " "(space equal char)
        System.out.println(str);// to print string character
        System.out.println(str.charAt(1));// to access element in string
        System.out.println(str.length());// to find length of str
//        System.out.println(str.charAt(-1));//error string zero base (0 to n-1
        System.out.println(str.concat(str2));// concat String together
        System.out.println(str.equals(str2));// boolean output
        System.out.println(str.compareTo(str1));// Asscii differ
        System.out.println(str.contains("ing"));

    }
}
