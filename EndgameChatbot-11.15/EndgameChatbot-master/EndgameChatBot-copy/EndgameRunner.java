
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class EndgameRunner extends EndgameChatBot
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		EndgameRunner endrun = new EndgameRunner();
		
		System.out.println (endrun.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (endrun.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
