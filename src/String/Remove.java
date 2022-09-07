package String;

import java.util.Set;

public class Remove {
    public static String removeVowel(String str){
        Set<Character> vowel = Set.of('a','o','e','i','u');
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(Character ch:charArray){
            if (!vowel.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        String ans = removeVowel(str);
        System.out.println(ans);
    }
}
