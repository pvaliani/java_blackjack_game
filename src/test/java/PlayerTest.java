import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    
    Player player1;
    Player player2;
    Player player3;
    Deck deck;
    Card card;
    
    @Before
    public void setUp(){
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player("Pedram");
        player2 = new Player("Owen");
        player3 = new Player("Chad");
    }


    @Test
    public void playerHasName(){
        assertEquals("Pedram", player1.getName());
    }


    @Test
    public void playerHandStartsEmpty(){
        assertEquals(0, player1.countCardsInHand());
    }


    @Test
    public void playerHasHandValue(){
        player1.addCardToHand(new Card(SuitType.SPADES, RankType.FIVE));
        assertEquals(5, player1.getValueOfHand());
    }

    
    
}
