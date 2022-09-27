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

    private void addHelper(TriesNode root,String str){
        if (str.length() == 0){
            root.isTerminal = true;
            return;
        }
        int childIndex = str.charAt(0) - 'A';
        TriesNode child = root.children[childIndex];
        if (child == null){
            child = new TriesNode(str.charAt(0));
            root.children[childIndex] = child;
        }
        addHelper(child,str.substring(1));
    }
    public void add(String str){
        addHelper(root,str);
    }
    public boolean search(String str){
        return false;
    }
    public void remove(String str){

    }

}
