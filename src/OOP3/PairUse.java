package OOP3;

public class PairUse {
    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("one",1);
        System.out.println(p.getFirst()+" "+p.getSecond());
        p.setFirst("two");
        p.setSecond(2);
        System.out.println(p.getFirst()+" "+p.getSecond());
    }
}
