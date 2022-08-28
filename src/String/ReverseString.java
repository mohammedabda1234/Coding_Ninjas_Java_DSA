package String;

public class ReverseString {
    public static String reverse(String str){
        String rev = "";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            rev+=str.charAt(i);
//        }
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i)+rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "Coding";
        String rev = reverse(str);
        System.out.println(rev);
    }
}
