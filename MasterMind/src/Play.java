import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Play 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// File l=new File("HighScore.txt");
		 
		
		System.out.println("                                   MASTERMIND");
		System.out.println();
		System.out.println("|    |           	|    |			  |    |			|    |");
		System.out.println("|    |           	|    |			  |    |			|    |");
		System.out.println("|    |           	|    |			  |    |			|    |");
		
		System.out.println("|____|           	|____|			  |____|			|____|    ");
		
		System.out.println();
		
		System.out.println("Each container contains a color from the following color options");
		System.out.println("-Red    -Blue    -Green    -White    -Black    -Yellow    -Violet    -Indigo    -Orange    -Grey");
		System.out.println("You need to guess the color present in ech container");
		System.out.println();

		Containers container=new Containers();
		
		while(true)
		{
			System.out.println("Enter your guess below");
			
			Scanner input=new Scanner(System.in);
			System.out.println("Container 1:");
			String a=input.nextLine();
			System.out.println("Container 2:");
			String b=input.nextLine();
			System.out.println("Container 3:");
			String c=input.nextLine();
			System.out.println("Container 4:");
			String d=input.nextLine();
			
			int result=container.check(a, b, c, d);
			if(result!=0)
			{
				System.out.println();
				System.out.println("                                   CONGRATULATIONS");
				System.out.println("                                   You have won");
				System.out.println();
				System.out.println("Please enter your name so that it can be recorded on the score board");
				String name=input.nextLine();
				try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("HighScore.txt", true)))) {
				    out.println("\n                              name :"+name+"        "+"result :"+result);
				
				}catch (IOException e) {
				    //exception handling left as an exercise for the reader
				}
				
				
				System.out.println("Enter 'y' to view scoreboard or 'n' to exit ");
				String score=input.nextLine();
				if(score.equals("n"))
				{
					System.out.println("Bye");
				}
				else
				{
					Scanner fInput=new Scanner(new File("HighScore.txt"));
					while(fInput.hasNext())
					{
						String p=fInput.nextLine();
						System.out.println(p);
						
					}
					fInput.close();
				}
				
				
				input.close();
				
				break;
			}
			System.out.println();
			System.out.println("Enter 'y' to continue or 'n' to give up ");
			String quit=input.nextLine();
			
			
			if(quit.equals("n"))
			{
				System.out.println("Better luck next time");
				System.out.println("Bye");
				input.close();
				break;
			}
			else
			{
				System.out.println();
				continue;
			}
			
			
		}
		
	}

}
