package Tries_And_Huffman;
import java.util.ArrayList;
class TriesNode{
    char data;
    boolean isTerminal;
    TriesNode children[];
    int childCount ;

     public TriesNode(char data){
        this.data = data;
        this.isTerminal = false;
        this.children = new TriesNode[26];
        this.childCount = 0;
    }
  }
  public class Tries {
    private TriesNode root;
    private int numWords;


      public Tries(){
        root = new TriesNode('\n');
        this.numWords = 0;
    }

    private boolean addHelper(TriesNode root,String str){
        if (str.length() == 0){
            root.isTerminal = true;
            return true;
        }
        int childIndex = str.charAt(0) - 'A';
        TriesNode child = root.children[childIndex];
        if (child == null){
            child = new TriesNode(str.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return addHelper(child,str.substring(1));
    }
    public void add(String str){
        if (addHelper(root,str)){
            numWords++;
        }
    }
    public boolean search(String str){
        return searchHelper(root,str);
    }

      private boolean searchHelper(TriesNode root, String str) {
        if (str.length() == 0){
            return root.isTerminal;
        }
        int childIndex = str.charAt(0) - 'A';
        TriesNode child = root.children[childIndex];
        if (child == null){
            return false;
        }
        return searchHelper(child,str.substring(1));
      }

      public void remove(String str){
        if (removeHelper(root,str)){
            numWords--;
        }
    }

      private boolean removeHelper(TriesNode root, String str) {
        if (str.length() == 0){
            root.isTerminal = false;
            return false;
        }
        int childIndex = str.charAt(0) - 'A';
        TriesNode child = root.children[childIndex];
        if (child == null){
            return false;
        }
          public boolean patternMatching(ArrayList<String> input,String pattern) {
              for(int i = 0 ; i<input.size();i++) {

                  String string = input.get(i);
                  Tries suffixTrie = new Tries();
                  for(int j=0;j<string.length();j++) {
                      suffixTrie.add(string.substring(j));
                  }
                  if(suffixTrie.search(pattern)) {
                      return true;
                  }
              }
              return false;
          }
       boolean ans = removeHelper(child,str.substring(1));
        if (!child.isTerminal && child.childCount == 0){
            root.children[childIndex] = null;
            root.childCount--;
        }
        return ans;
      }
      public int countWords() {
          return numWords;
      }

  }
