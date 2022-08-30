package String;

public class ReverseWord {
    public static String reverseEachWord(String str) {
        String rev = "";
        int start = 0;
        String finalans = "";
        int len = str.length();
        for(int i = 0; i<len; i++){
            if (str.charAt(i) == ' '){
                for(int j =start; j<i; j++){
                    rev = str.charAt(j) + rev;
                }
                start = i;
            }
            else if (i==len-1){
                for(int j = start; j<len; j++){
                    rev = str.charAt(j) +rev;
                }
            }
        }
        int space = rev.length();
        for(int i = rev.length()-1; i>=0;i--){
            if (i==0){
                finalans = finalans+rev.substring(0,space);
            }
            else if(rev.charAt(i)== ' '){
                finalans = finalans+rev.substring(i+1,space)+" ";
                space = i;
            }
        }
        return finalans;
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseEachWord(str));
    }
}
