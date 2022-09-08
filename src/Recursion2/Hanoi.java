package Recursion2;

public class Hanoi {
    public static void towerHanoi(int n,char s,char h,char d){
        if (n == 1){
            System.out.println("move 1st disk from "+s+" to "+d);
            return;
        }
        towerHanoi(n-1,s,h,d);
        System.out.println("move "+n+" th disk from "+s+" to "+d);
        towerHanoi(n-1,h,s,d);

    }
    public static void main(String[] args) {
        towerHanoi(4,'s','h','d');
    }
}
