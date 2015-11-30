import java.util.Scanner;


public class Play 
{

	public static void main(String[] args) 
	{
		boolean end=false;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("player1 enter name and symbol:");
		Player player1=new Player(input.nextLine(),input.nextLine());
		
		System.out.println("player2 enter name and symbol :");
		Player player2=new Player(input.nextLine(),input.nextLine());
		
		Board board=new Board();
		board.show();
		
		int i=0;
		while(i<9)
		{
			System.out.println(player1.getName()+" please enter the position(1-9) where you would like to place your "+"'"+player1.getSymbol()+"'");
			end=board.add(input.nextInt(), player1);
			i++;
			
			if(end)
			{
				break;
			}
			System.out.println(player2.getName()+" please enter the position(1-9) where you would like to place your "+"'"+player2.getSymbol()+"'");
			end=board.add(input.nextInt(), player2);
			i++;
			
			System.out.println();
			
			if(end)
			{
				break;
			}
			
			if(i==9)
			{
			System.out.println("                                              DRAW");
			}
		}
		input.close();
		
		
		

	}

}
