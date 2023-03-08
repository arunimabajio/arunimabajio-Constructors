
import org.junit.Test;

/**
 * See 'player' class for challenge instructions.
 * This is a harder problem.
 */
public class PlayerTest {
    /**
     * If a new player is instantiated using the argument "Frodo", their name should be "Frodo",
     * and their level should be 1.
     */
    @Test
    public void player1ArgConstructorTest1(){
        Player p = new Player("Frodo");
        System.out.println(p.level);

    }

    /**
     * If a new player is instantiated using the argument "Sam", their name should be "Sam",
     * and their level should be 1.
     */
    @Test
    public void player1ArgConstructorTest2(){
        Player p = new Player("Sam");
        System.out.println(p.level);
    }
    /**
     * If a new player is instantiated using the arguments "Gollum" and 5, their name should be "Gollum",
     * and their level should be 5.
     */
    @Test
    public void player2ArgConstructorTest1(){
        Player p = new Player("Gollum", 5);
       
        System.out.println(p.level);
    }
}