package String;

public class reverseEachWord {
    public static String reverseWordWise(String input) {
        int end = input.length() - 1,start,j;
        String result ="",word = "";
        for(int i= input.length() - 1;i >= 0;i--) {
            if(input.charAt(i) == ' ') {
                start = i + 1;
                word = "";
                for(j = start;j <= end;j++) {
                    word += input.charAt(j);
                }
                end  = i - 1;
                result = result + word + " ";
            }
        }
        word = "";
        for(j = 0;j <= end;j++) {
            word = word + input.charAt(j);
        }
        result += word;
        return result;
    }
    public static String reveseEachWord(String str){
        String ans = "";
        int i = 0;
        int currentWordStart = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i)== ' '){
                // reverse current word
                String reverseWord = "";
                int currentWordEnd = i - 1;
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reverseWord = str.charAt(j)+reverseWord;
                }
                ans += reverseWord +" ";
                currentWordStart = i + 1;
            }
        }
        String reverseWord = "";
        int currentWordEnd = i - 1;
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reverseWord = str.charAt(j)+reverseWord;
        }
        ans += reverseWord;
        return  ans;
    }
    public static void main(String[] args) {
        String str = "coding is fun";
        System.out.println(reverseWordWise(str));
        System.out.println(reveseEachWord(str));
    }
}
