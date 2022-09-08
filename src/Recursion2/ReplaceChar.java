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
    public static String removeX(String str){
        if (str.length() == 0){
            return str;
        }
        if (str.charAt(0) == 'x'){
            return removeX(str.substring(1));
        }else {
            return str.charAt(0)+removeX(str.substring(1));
        }
    }
    public static String replacePi(String str){
       if (str.length() <= 1){
           return str;
       }
       if (str.charAt(0) == 'p' && str.charAt(1) == 'i'){
           String output = replacePi(str.substring(2));
           return "3.14"+output;
       }
       else {
           String output = replacePi(str.substring(1));
           return str.charAt(0)+output;
       }

    }
    public static String removeDuplicates(String str){
        if (str.length() <= 1){
            return str;
        }
        String output = removeDuplicates(str.substring(1));
        if (output.charAt(0) == str.charAt(0)){
            return output;
        }
        else return str.charAt(0)+output;
    }
    public static void main(String[] args) {
        System.out.println(replace("abacd",'a','x'));
        System.out.println(removeX("relex"));
        System.out.println(replacePi("pifacepi"));
        System.out.println(removeDuplicates("hello"));
    }
}
