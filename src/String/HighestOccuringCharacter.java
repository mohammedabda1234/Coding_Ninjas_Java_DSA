package String;

public class HighestOccuringCharacter {
    public static char highestOccuringChar(String str) {
        int len = str.length();
        int[] freq = new int[255];
        int lena = freq.length;
        int max = 0;
        int maxi = 0;
        for(int i = 0; i<len; i++){
            int var = (int)str.charAt(i);
            freq[var]++;
        }
        for(int j = 0; j<lena; j++){
            if (freq[j]>max){
                max = freq[j];
                maxi = j;
            }
        }
        char ans = (char)maxi;
        return ans;
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(highestOccuringChar(str));
    }
}
