package String;

public class PrintAll {
    public static void printSubstring(String str){
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i; j < str.length() - 1; j++) {
//                System.out.println(str.substring(i,j+1));
//            }
//        }
        for (int len = 1; len <= str.length(); len++) {
            for (int start = 0; start <= str.length() -len; start++) {
                int end = start + len - 1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }
    public static void main(String[] args) {
        String str = "face";
        printSubstring(str);
    }
}
