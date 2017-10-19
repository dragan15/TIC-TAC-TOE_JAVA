
/**
 * Write a description of class PlayTicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class PlayTicTacToe
{
   public static void main(String[]angs)
      {   Scanner in =new Scanner(System.in);
          TicTacToe game= new TicTacToe();
          int r, c;
        while(!game.isTie() && (game.checkwin()==0))
         {
            game.printboard();
             {
               System.out.println("Enter move, by typing first coordinate, followed by second (player 1):");
               do{
                  r = in.nextInt();
                  c = in.nextInt();
                }
               while(!game.makemove(r,c,1));
               if(game.checkwin() !=0)
                {
                  System.out.println("player" + game.checkwin() + "won");
                  break;
                }
               if(game.isTie())
                 {
                   System.out.println("Tie game");
                   break;
                 }
              /* if(game.checkwin() !=0)
                {
                  System.out.println("player" + game.checkwin() + "won");
                  break;
                }*/
                game.printboard();
                System.out.println("Enter Move by typing first coordinate, followed by second(Player 2):");
                 do{
                  r = in.nextInt();
                  c = in.nextInt();
                }
               while(!game.makemove(r,c,2));
                if(game.isTie())
                 {
                   System.out.println("Tie game");
                   break;
                 }
               if(game.checkwin() !=0)
                {
                  System.out.println("player" + game.checkwin() + "won");
                  break;
                }    
            }
        }
    } 
}
