public class Player {

    private String name;
    private Card hand;


    public Player(String name, Card hand){
        this.name = name;
        this.hand = hand;
    }

    public Card getHand() {
        return hand;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card) {
        this.hand = card;
    }




}
