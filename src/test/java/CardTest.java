import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.TWO);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.TWO, card.getRank());
    }

    @Test
    public void queenHasValue2(){
        assertEquals(2, card.getValueFromEnum());
    }

//    @Test
//    public void suitCanBeMispelled(){
//        card = new Card("hearts");
//        assertEquals("hearts", card.getSuit());
//    }

}
