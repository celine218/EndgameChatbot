import java.util.*;
import java.lang.String;
/**
 * Write a description of class NameGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameGame
{
    public String NameGame(String statement) 
    {
      Scanner a = new Scanner(System.in);
      String b = a.next();
      String response = "";
      List<String> names = Arrays.asList("Iron Man","Black Widow","Captain America",
            "Thor","Hulk", "Hawkeye","Falcon","War Machine","Scarlet Witch","Ant Man",
            "Wasp","Spider Man","Star Lord","Nebula","Gamora","Drax","Rocket","Groot",
            "Mantis","Doctor Strange","Wong","Black Panther","Okoye","Bucky","Valkrine", 
            "Captain Marvel");
      boolean contains = names.contains(b);
      if (names.contains(b)) 
        {
         System.out.println("I dont remember them, did they die?");
         NameGame(b);
        }
      else if(!names.contains(b))
        {
          System.out.println("Correct!");
          NameGame(b);
        } 
      return response;
    }
}

