package OOP3;

public class PairUse {
    public static<T extends print> void print(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
    }
    public static void main(String[] args) {
      Student[] s = new Student[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student(10*i +1);
        }
        print(s);
    }
}
