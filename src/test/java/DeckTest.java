import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;


    @Before
    public void setUp(){
        deck = new Deck();
    }


    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countCardsInDeck());
    }

    @Test
    public void canPopulateDeckWith52Cards(){
        deck.populateDeck();
        assertEquals(52, deck.countCardsInDeck());
    }

    @Test
    public void canShuffleDeck(){
        deck.populateDeck();
        System.out.println(deck.getCards());
        System.out.println("This is the original deck");
        deck.shuffleCards();
        System.out.println(deck.getCards());
        System.out.println("This be the shuffled deck");
    }

    @Test
    public void canRemoveCardFromDeck(){
        deck.populateDeck();
        deck.removeCardFromDeck();
        assertEquals(51, deck.countCardsInDeck());

    }



}
