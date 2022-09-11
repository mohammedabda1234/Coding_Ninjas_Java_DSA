package OOP3;

public class PairUse {
    public static void main(String[] args) {
        Pair<String,Integer> pInner = new Pair<>("one",1);
        Pair<Pair<String,Integer>,String> p = new Pair<>();
        p.setFirst(pInner);
//        p.setSecond("abcd");
        System.out.println();
        System.out.println(p.getFirst().getFirst());
        System.out.println(p.getFirst().getSecond());
//        System.out.println();
//        Pair<String,Integer> p = new Pair<>("one",1);
//        System.out.println(p.getFirst()+" "+p.getSecond());
//        p.setFirst("two");
//        p.setSecond(2);
//        System.out.println(p.getFirst()+" "+p.getSecond());
    }
}
