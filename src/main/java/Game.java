import java.util.ArrayList;

public class Game {


    private ArrayList<Player> players;
    private String winner;
    private Deck deck;
    private int winningScore;

//    Game class constructor defines a game with players and a deck
    public Game(Deck deck){
        this.players = new ArrayList<Player>();
        this.winner = winner;
        this.deck = deck;
        this.winningScore = 0;
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }

    public int getWinningScore(){
        return this.winningScore;
    }

    public void addPlayer(Player player){
        this.players.add(player);

    }




}


