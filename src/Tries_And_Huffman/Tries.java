package Tries_And_Huffman;
class TriesNode{
    char data;
    boolean isTerminal;
    TriesNode children[];

     public TriesNode(char data){
        this.data = data;
        this.isTerminal = false;
        this.children = new TriesNode[26];
    }
  }
  public class Tries {
    private TriesNode root;

    public Tries(){
        root = new TriesNode('\n');
    }

    public void add(String str){

    }
    public boolean search(String str){
        return false;
    }
    public void remove(String str){

    }

}
