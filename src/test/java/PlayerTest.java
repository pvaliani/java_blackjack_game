import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    
    Player player1;
    Player player2;
    Deck deck;
    Card card;
    
    @Before
    public void setUp(){
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player("Pedram");
    }


    @Test
    public void playerHasName(){
        assertEquals("Pedram", player1.getName());
    }


    @Test
    public void playerHandStartsEmpty(){
        assertEquals(0, player1.countCardsInHand());
    }

    
    
}
