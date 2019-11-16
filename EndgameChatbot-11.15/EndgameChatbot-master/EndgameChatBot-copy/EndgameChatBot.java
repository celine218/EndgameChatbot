import java.util.*;
import java.lang.String;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

public class EndgameChatBot
{  
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {

        findKeyword("clint and tony", "Clint", 0);
        findKeyword("Vomir sacrafice.", "sacrafice", 0);

        return "Hello, let's talk about Endgame!";
    }
    /*public static void main(String args[]){  
            ArrayList<String> endNames=new ArrayList<String>();  
            endNames.add("Iron Man");
            endNames.add("Captain America");
            endNames.add("Thor");
            endNames.add("Hawkeye");
            endNames.add("Hulk");
            endNames.add("Falcon");
            endNames.add("War Machine");
            endNames.add("Scarlet Witch");
            endNames.add("Ant Man");
            endNames.add("Wasp");
            endNames.add("Spider Man");
            endNames.add("Star Lord");
            endNames.add("Nebula");
            endNames.add("Gamora");
            endNames.add("Drax");
            endNames.add("Rocket");
            endNames.add("Groot");
            endNames.add("Mantis");
            endNames.add("Doctor Strange");
            endNames.add("Wong");
            endNames.add("Black Panther");
            endNames.add("Okoye");
            endNames.add("Bucky");
            endNames.add("Valkrine");
            endNames.add("Captain Marvel");
    }*/
    public String NameGame(String statement) 
    {
      String response = "";
      List<String> names = Arrays.asList("Iron Man","Captain America","Thor","Hulk", "Hawkeye","Falcon","War Machine","Scarlet Witch","Ant Man","Wasp","Spider Man","Star Lord","Nebula","Gamora","Drax","Rocket","Groot","Mantis","Doctor Strange","Wong","Black Panther","Okoye","Bucky","Valkrine", "Captain Marvel");   
      boolean contains = names.contains(statement);
      if (contains = true) {
        response = "correct!";
      }
      else {
        response = "I dont remember them, did they die?";
      }
      return response;
    }
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("endgame") >= 0)
        {
            response = "The greatest movie, deserves an oscar";
        }
        
        else if (statement.indexOf("stark") >= 0
                || statement.indexOf("Tony Stark") >= 0
                || statement.indexOf("Stark") >= 0
                || statement.indexOf("Ironman") >= 0
                || statement.indexOf("tony") >= 0)
        {
                response = "Tony Stark was a pretty cool character, I miss him.";
        }
        
        else if (statement.indexOf("natasha") >= 0
                || statement.indexOf("black widow") >= 0)
        {
                response = "Natasha shouldn't have died, it should have been Clint";
        }
        
        else if (statement.indexOf("natasha") >= 0
                && statement.indexOf("clint") >= 0)
        {
                response = "Nobody appreciated them until one of them had to die.";
        }
        else if (statement.indexOf("hawkeye") >= 0
                || statement.indexOf("clint") >= 0)
        {
                response = "They kept Clint alive because he had a family but not Tony?";
        }
        
        else if (statement.indexOf("hawkeye") >= 0
                && statement.indexOf("hair") >= 0)
        {
                response = "Thanos snapped half his hair away too.";
        }
        else if (statement.indexOf("loki") >= 0
                && statement.indexOf("dead") >= 0)
        {
               response = "There is no way Loki is dead, you cant not tell me that the god of mischeif's plan was to attack Thanos with a butter knife.";
        }
        
        else if (statement.indexOf("loki") >= 0
                || statement.indexOf("thor's brother") >= 0)
        {
              response = "Loki is the best character, I'm glad we say him in Endgame.";
        }
        
        else if (statement.indexOf("nebula") >= 0
                || statement.indexOf("blueberry") >= 0)
        {
                response = "I love Nebula, the raging blueberry";
        }
        
        else if (statement.indexOf("gamora") >= 0
                || statement.indexOf("nebula's sister") >= 0)
        {
               response = "Gamora did not deserve to die in Volmir, Thanos is the worst dad ever";
        }
        
        else if (statement.indexOf("thanos") >= 0
                || statement.indexOf("the snap") >= 0)
        {
                response = "Thanos did have a point, but poorly executed.";
        }
        
        else if (statement.indexOf("captain america") >= 0
                || statement.indexOf("steve rogers") >= 0)
        {
                response = "He has America's butt.";
        }
        
        else if (statement.indexOf("captain america") >= 0
                && statement.indexOf("thor") >= 0)
        {
                response = "Cap is worthy!!.";
        }
        
        else if (statement.indexOf("bruce") >= 0
                || statement.indexOf("banner") >= 0
                || statement.indexOf("hulk") >= 0)
        {
                response = "Incredible Hulk to Cedible Hulk, amirite?";
        }
        
        else if (statement.indexOf("bruce") >= 0
                || statement.indexOf("hulk") >= 0
                && statement.indexOf("selfie") >= 0)
        {
                response = "I want a selfie with him :(.";
        }
        
        else if (statement.indexOf("falcon") >= 0
                || statement.indexOf("sam") >= 0)      
        {
                response = "You mean the new Captain America?";
        }
        
        else if (statement.indexOf("dr.strange") >= 0
                || statement.indexOf("strange") >= 0)      
        {
                response = "He knew!! He knew Tony would die!!";
        }
        
        else if (statement.indexOf("ant man") >= 0
                || statement.indexOf("ant-man") >= 0
                || statement.indexOf("lang") >= 0 
                || statement.indexOf("scott") >= 0)
        {
                response = "I think we all know he could have ended this in one move ( ͡° ͜ʖ ͡°)";
        }
        
        else if (statement.indexOf("black panther") >= 0
                || statement.indexOf("t'challa") >= 0)      
        {
                response = "I bet he wishes they just built that Starbucks";
        }
        
        else if (statement.indexOf("bucky") >= 0
                || statement.indexOf("barnes") >= 0)      
        {
                response = "Stucky was the best duo, dont argue with me.";
        }
        
        else if (statement.indexOf("bucky") >= 0
                || statement.indexOf("barnes") >= 0
                && statement.indexOf("rocket") >=0)
        {
               response = "Did he give Rocket his arm tho?";
        }
        
        else if (statement.indexOf("time travel") >= 0
                || statement.indexOf("time") >= 0)      
        {
               response = "The solution to our universe is the morbius band a.k.a a dysfinctional rubber band.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn)
                .toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1)
                .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Who was the sadder Volmir sacrifice?";
        }
        else if (whichResponse == 1)
        {
            response = "Do you miss Tony Stark?";
        }
        else if (whichResponse == 2)
        {
            response = "Who's the most powerful Avenger?";
        }
       
        return response;
    }
}
