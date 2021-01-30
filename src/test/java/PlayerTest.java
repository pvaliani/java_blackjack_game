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
        player1 = new Player("Evian", card);
    }



    @Test
    public void playerHasName(){
        assertEquals("Evian", player1.getName());
    }

    @Test
    public void playerHasHand(){
        player1.addCardToHand(card);
        assertEquals(card, player1.getHand());
    }

    
    
}
