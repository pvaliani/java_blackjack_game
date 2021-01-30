import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Deck deck;
    private Game game;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {

        deck = new Deck();
        deck.populateDeck();
        game = new Game(deck);
        player1 = new Player("Pedram");
        player2 = new Player("Owen");

    }


    // test that the game starts empty
    @Test
    public void gameStartsWithNoPlayers() {
        assertEquals(0, game.getNumberOfPlayers());
    }


    //    can add player to a game
    @Test
    public void canAddPlayerToGame() {
        game.addPlayer(player1);
        assertEquals(1, game.getNumberOfPlayers());
    }

    @Test
    public void canDealACardToEachPlayerInGame() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.dealCardToMultiplePlayers(0);
        assertEquals(1, player1.countCardsInHand());
        assertEquals(1, player2.countCardsInHand());

    }


    @Test
    public void canPlayGame__oneWinner() {
        player1.addCardToHand(new Card(SuitType.HEARTS, RankType.ACE));
        player2.addCardToHand(new Card(SuitType.CLUBS, RankType.FIVE));
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.playGame();
        assertEquals(5, game.getWinningScore());


    }

//    @Test
//    public void canDeclareWinner__OneWinner(){
//        player1.addCardToHand(new Card(SuitType.HEARTS, RankType.ACE));
//        player2.addCardToHand(new Card(SuitType.CLUBS, RankType.FIVE));
//        game.addPlayer(player1);
//        game.addPlayer(player2);
//        game.playGame(0);
//        assertEquals("Congratulations you won!", game.declareWinner(0));
//    }




}

