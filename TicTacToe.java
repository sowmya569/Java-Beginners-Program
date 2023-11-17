import java.util.Scanner;

public class TICTACTOE {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        Scanner ob=new Scanner(System.in);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=' ';
            }
        }
        boolean gameOver=false;
        char player='X';
        while(!gameOver){
            BoardFull(board);
            // printBoard(board);
        int r=ob.nextInt();
        int c=ob.nextInt();
        if(board[r][c]==' '){
            board[r][c]=player;
            gameOver=HasWon(board,player);
            if(gameOver){
                System.out.println("Congratualtions!! "+player+"\nYou have won the game");
                break;
            }
            else{
                if(player=='X'){
                player='O';
                System.out.println("It's"+player+"chance");
            }
                else{
                player='X';
              System.out.println("It's"+player+"chance");
                }
            }
        }else{
            System.out.println("Please enter the proper eye");
        }
        }
        printBoard(board);
        ob.close();
    }
    public static void printBoard(char[][] board){
        for(int i=0;i<board.length;i++){
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static boolean HasWon(char[][] board,char player){
        for(int i=0;i<board.length;i++)
        if(board[i][0]==player &&board[i][1]==player && board[i][2]==player )
        return true;

         for(int i=0;i<board[0].length;i++)
        if(board[0][i]==player &&board[1][i]==player && board[2][i]==player )
        return true;

        //  for(int i=0;i<board.length;i++)
        if(board[0][0]==player &&board[1][1]==player && board[2][2]==player )
        return true;

        if(board[2][0]==player &&board[1][1]==player && board[0][2]==player )
        return true;
    
        return false;
    }
    public static void BoardFull(char[][] board){
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!=' '){
count++;
                }
            }
        }
        if(count==9){
            System.out.println("The match is draw");
            System.exit(0);
        }
    }
}
