package OOP4;

import java.util.Scanner;

public class TicTacToe {
    private Player player1 ,player2;
    private Board board;
    private int numPlayer;
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();

    }
    public void startGame(){
        Scanner s = new Scanner(System.in);
        // take player input
        player1 = takePlayerInput(++numPlayer);
        player2 = takePlayerInput(++numPlayer);
        while (player1.getSymbol() == player2.getSymbol()){
            System.out.println("symbol already taken please the symbol again ");
            player2.setSymbol(s.next().charAt(0));
        }
        // create board
        board = new Board(player1.getSymbol(),player2.getSymbol());
        // play game
        boolean player1Turn = true;
        int status = Board.INCOMPLETE;
        while (status == Board.INCOMPLETE || status == Board.INVALIDMOVE){
            if (player1Turn){
                System.out.println("player 1 -  "+player1.getName()+"'s Turn");
                System.out.println("Enter x:");
                int x = s.nextInt();
                System.out.println("Enter y:");
                int y = s.nextInt();
                status = board.move(player1.getSymbol(),x,y);
                if (status == Board.INVALIDMOVE){
                    System.out.println("Invalid move !! please try again !!");
                    continue;
                }
            }else {
                System.out.println("player 2 -  "+player2.getName()+"'s Turn");
                System.out.println("Enter x:");
                int x = s.nextInt();
                System.out.println("Enter y:");
                int y = s.nextInt();
                status = board.move(player2.getSymbol(),x,y);
                if (status == Board.INVALIDMOVE){
                    System.out.println("Invalid move !! please try again !!");
                    continue;
                }
            }
            player1Turn = !player1Turn;
            board.print();
        }
        if (status == Board.PLAYER1WIN){
            System.out.println("Player -1 "+player1.getName()+" wins !!");
        } else if (status == Board.PLAYER2WIN) {
            System.out.println("Player -2 "+player2.getName()+" wins !!");
        }else
            System.out.println("DRAW");
    }
    private Player takePlayerInput(int num){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter player "+num+" name : ");
        String name = s.nextLine();
        System.out.println("Enter player "+num+" symbol : ");
        char symbol = s.next().charAt(0);
        Player p = new Player(name,symbol);
        return p;
    }
}
