    
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
		    /*if (statement.indexOf("Name Game") >= 0
                        || statement.indexOf("name game") >= 0)
                    {
                        System.out.println("Welcome to the Name Game. Say stop to end the game.");
                        System.out.println("Name as many avengers as you can! Go!");
                        System.out.println(endrun.NameGame(statement));
                        statement = in.nextLine();
                    }
		    else */
		    {
		        System.out.println (endrun.getResponse(statement));
		        statement = in.nextLine();
		    }
		}
	}

}
