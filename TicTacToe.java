
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    private int[][]board =new int[3][3]; //creates dimension of the board
   
   public TicTacToe()
    { for(int i =0; i <3; i++)//row
        for(int j=0; j<3 ;j++)//column
          board[i][j] = 0;
    }      
   public boolean makemove(int r, int c, int p) //creates move for the users. r=row, c=column, p=player
    {if(isvalidmove(r,c)) //if move within row and colum, implement move, else dont 
      {
          board[r][c]=p; 
          return(true); //move is true, continue
      }
     else
      return(false);
    }  
    private boolean isvalidmove(int r, int c)
     {
       if(r<0 || r>2 || c < 0 || c>2) //if not in board, return false 
         {
            System.out.println("Move is invalid, spot is not within the board");
            
            return(false);
           
         }
        else if(board[r][c] !=0)//if value is already there
         {
            System.out.println("Move is invalid, value already placed their");
            return(false);
         }
        else
         return(true); //else continue as usual
     }
   public void printboard() //prints out tic tac toe board. need some modification to look correct
    {
        System.out.println("  0  1  2");
        System.out.println("0 " + board[0][0] + "|" + board[0][1] + "|"
                + board[0][2]);
        System.out.println(" -----");
        System.out.println("1 " + board[1][0] + "|" + board[1][1] + "|"
                + board[1][2]);
        System.out.println(" -----");
        System.out.println("2 " + board[2][0] + "|" + board[2][1] + "|"
                + board[2][2]);
        
        
    }
    
   public boolean isTie()
    { int prod=1;
      if(checkwin()==0) //if no one won the game, check if board is full
       {
         for(int i=0; i<3; i++)
          for(int j=0; j<3; j++)
           prod *=board[i][j];
          
           if(prod==0)
            return(false);
            else
            return(true);
           
        }else return(true);
    } 
   public int checkwin() 
    {int prod=1;
      //check vertical rows
       for(int j=0;j<3; j++)
        {prod = board[0][j]*board[1][j]*board[2][j];
          if(prod !=0)
           {if(prod==1)
              return(1);
              
            else if(prod==8)
             return(2);
             
           }  
         }
       for(int j=0; j<3;j++)
        {prod = board[j][0]*board[j][1]*board[j][2];
           if(prod !=0)
            {if(prod==1)
                 return(1);
                 else if(prod==8)
                  return(2);
            }
        }  
        
      prod= board[0][0]*board[1][1]*board[2][2];
       if(prod!=0)
        {
          if(prod==1)
           return(1);
           else if(prod ==8)
            return(2);
        }
        prod = board[2][0]*board[1][1]*board[0][2];
         if(prod !=0)
          {if(prod==1)
             return(1);
             else if(prod==8)
              return(2);
           }
           return(0);
        }
}
