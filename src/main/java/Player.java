import java.util.ArrayList;

public class Player {

//    Declare a name and hand instance
    private String name;
    private ArrayList<Card> hand;

// Hand is an arrayList of cards for a player
    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

//  Constructor defines a player for the game
    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

//   retrieve the hand of the players cards
    public ArrayList<Card> getHand() {
        return hand;
    }

//    getName method gets player name
    public String getName() {
        return this.name;
    }

// sets player name
    public void setName(String name) {
        this.name = name;
    }

//  adds a card to the players hand
    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

//    count cards in players hand
    public int countCardsInHand(){
        return this.hand.size();
    }




}
