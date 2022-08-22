package Patterns2;
import java.util.Scanner;
public class OddSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 0; i < N ; i++){
            for(int j = i*2+1; j < N*2; j+=2){
                System.out.print(j);
            }
            for (int j = 0; j< i; j++){
                System.out.print(j*2+1);
            }
            System.out.println();
        }
    }
}
