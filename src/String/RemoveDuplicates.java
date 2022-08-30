package String;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        String x = "";
        int temp = Integer.MIN_VALUE;
        int len = str.length();
        for(int i = 0; i<len; i++){
            if (temp!=(int)str.charAt(i)){
                x = x+str.charAt(i);
                temp = (int)str.charAt(i);
            }
        }
        return x;
    }
    public static void main(String[] args) {
        String str = "access";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
