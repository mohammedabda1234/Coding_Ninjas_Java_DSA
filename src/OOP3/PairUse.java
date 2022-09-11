package OOP3;

public class PairUse {
    public static void main(String[] args) {
        Pair<String> ps = new Pair<String>("aa","bb");//object of generic class
        System.out.println(ps.getFirst()+" "+ps.getSecond());
       // Pair<int> pi = new Pair<int>(2,5);// only can use non paramative
        Pair<Integer> pi = new Pair<Integer>(5,7);
        System.out.println(pi.getFirst()+" "+pi.getSecond());

    }
}
