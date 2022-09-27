package Tries_And_Huffman;

public class TriesUse {
    public static void main(String[] args) {
        Tries t = new Tries();
        t.add("NOTE");
        t.add("AND");
        System.out.println(t.search("AND"));
        t.remove("AND");
        System.out.println(t.search("AND"));
    }
}
