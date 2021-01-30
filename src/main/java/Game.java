import java.util.ArrayList;

public class Game {


    private ArrayList<Player> players;
    private String winner;
    private Deck deck;

    public Game(Deck deck){
        this.players = new ArrayList<Player>();
        this.winner = winner;
        this.deck = deck;
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }




}


