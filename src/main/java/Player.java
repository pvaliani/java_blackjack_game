import java.util.ArrayList;

public class Player {

//    Declare a name and hand instance
    private String name;
    private ArrayList<Card> hand;

// Hand is an arrayList of cards for a player
    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public Player(String name, Card hand){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

//   retrieve the hand of the players cards
    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }




}
