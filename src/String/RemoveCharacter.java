package String;

public class RemoveCharacter {
    public static String remove(String str,char ch){
        String rem = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch)
                rem += str.charAt(i);
        }
        return rem;
    }
    public static void main(String[] args) {
        String str = "coding";
        System.out.println(remove(str,'c'));
    }
}
