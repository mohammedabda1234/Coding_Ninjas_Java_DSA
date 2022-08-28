package String;

public class PalindromeString {
    public static boolean palindrome(String str){
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i)+rev;
        }
        if (rev.equals(str)){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(String str) {

        int j = 0;
        int i = str.length()-1;
        str = str.toLowerCase();

        while(j <= i)
        {

            char getAtj = str.charAt(j);
            char getAti = str.charAt(i);

            if (!(getAtj >= 'a' && getAtj <= 'z'))
                j++;
            else if(!(getAti >= 'a' && getAti <= 'z'))
                i--;
            else if( getAtj == getAti)
            {
                j++;
                i--;
            }

            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPalindrome(str));
    }
}
