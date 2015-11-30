import java.util.HashSet;
import java.util.Scanner;


public class Board 
{
	String[][] playingboard={{" "," "," "},{" "," "," "},{" "," "," "}};
	Scanner input=new Scanner(System.in);
	HashSet<Integer> repeat=new HashSet<Integer>();

	
	public void show()
	{
		int k=1;
		System.out.println();
		System.out.println("Playing board");
		System.out.println();
		System.out.println("-----------------");
	    for (int i = 0; i < 3; i++) 
	    {
	    	
	        for (int j = 0; j < 3; j++) 
	        {
	        	
	        	
	            System.out.print(k+":"+playingboard[i][j]+" | ");
	            k++;
	            
	        }
	        System.out.println("");
	        System.out.println("-----------------");
	        
	    }
	    System.out.println();
	    k=1;
	}
	
	public boolean add(int pos,Player player)
	{
		boolean end=false;
		
		if(repeat.contains(pos))
		{
			System.out.println("location already taken please enter again");
			
			add(input.nextInt(),player);
			
		}
		else
		{
			repeat.add(pos);
			switch(pos)
			{
				case(1):playingboard[0][0]=player.getSymbol();
						break;
				case(2):playingboard[0][1]=player.getSymbol();
						break;
				case(3):playingboard[0][2]=player.getSymbol();
						break;
				case(4):playingboard[1][0]=player.getSymbol();
				break;
				case(5):playingboard[1][1]=player.getSymbol();
				break;
				case(6):playingboard[1][2]=player.getSymbol();
				break;
				case(7):playingboard[2][0]=player.getSymbol();
				break;
				case(8):playingboard[2][1]=player.getSymbol();
				break;
				case(9):playingboard[2][2]=player.getSymbol();
				break;
			}
			show();
			if(win(player))
			{
				System.out.println("                        						CONGRATULATIONS");
				System.out.println("                        						"+player.getName()+" you are the winner");
				
				end=true;
			}
		}
		return end;
		
	}
	
	public boolean win(Player player)
	{
		boolean playerwon=false;
		
		for(int i=0;i<3;i++)
		{
			if(playingboard[i][0]==player.getSymbol() && playingboard[i][1] ==player.getSymbol()&& playingboard[i][2]==player.getSymbol())
			{
				playerwon=true;
			}
		}
		for(int j=0;j<3;j++)
		{
			if(playingboard[0][j]==player.getSymbol() && playingboard[1][j] ==player.getSymbol() && playingboard[2][j]==player.getSymbol())
			{
				playerwon=true;
			}
		}
		int x=0,y=0;
		if(playingboard[x][y]==player.getSymbol() && playingboard[x+1][y+1] ==player.getSymbol()&& playingboard[x+2][y+2]==player.getSymbol())
		{
			playerwon=true;
		}
		if(playingboard[x+2][y]==player.getSymbol() && playingboard[x+1][y+1] ==player.getSymbol()&& playingboard[x][y+2]==player.getSymbol())
		{
			playerwon=true;
		}
		
		
		return playerwon;
	}

}
