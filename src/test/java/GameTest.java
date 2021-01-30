import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Deck deck;
    private Game game;
    private Player player1;
    private Player player2;

    @Before
    public void setUp(){

        deck = new Deck();
        deck.populateDeck();
        game = new Game(deck);
        player1 = new Player("Pedram");
        player2 = new Player("Owen");

    }


// test that the game starts empty
    @Test
    public void gameStartsWithNoPlayers(){
        assertEquals(0, game.getNumberOfPlayers());
    }


//    can add player to a game
    @Test
    public void canAddPlayerToGame(){

    }



}
