import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private Card card;

    private ArrayList<Card> cards;

    public Deck(){

        this.cards = new ArrayList<Card>();

    }

    public int countCardsInDeck(){
        return this.cards.size();
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }



// add cards/a card to deck

    public void populateDeck(){

        Card createdCard = null;

        for(SuitType suits: SuitType.values()){
            for(RankType ranks: RankType.values()){
                createdCard = new Card(suits, ranks);
                this.cards.add(createdCard);


            }
        }

    }

//    shuffle dem cards!
    public ArrayList<Card> shuffleCards(){
        Collections.shuffle(this.cards);
        return this.cards;
    }

// remove a wee card!
    public Card removeCardFromDeck(){
        Card removedCard = this.cards.remove(0);
        return removedCard;
    }


//    deal a wee card!

    public void dealCard(){

        Card dealtCard = this.cards.remove(0);
//        addCardToHand(dealtCard);
//       if countcards > = then do the thing below
//      remove card from the deck
//        add card to players hand


    }


}
