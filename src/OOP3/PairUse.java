package OOP3;

public class PairUse {
    public static<T> void print(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }
        print(arr);
        String[] arrs = new String[5];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i]= "abcd";
        }
        print(arrs);
    }
}
