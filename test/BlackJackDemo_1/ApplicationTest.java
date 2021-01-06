package BlackJackDemo_1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class ApplicationTest {
    private CardDeck cardDeck;
    private List<Card> cards;
    @Before
    public void setup(){
        cardDeck = new CardDeck();
        cards = CardDeck.getCard();
    }

    @Test
    public void test_카드댁생성(){
        CardDeck cardDeck = new CardDeck();
        List<Card> cards = cardDeck.getCard();
        Assert.assertThat(cards.get(0).getPattern(), is(Card.Pattern.SPADE));
        Assert.assertThat(cards.get(13).getPattern(), is(Card.Pattern.HEART));
    }
    @Test
    public void test_카드끗수비교(){
        Assert.assertThat(cards.get(0).getDenomination(), is(Card.Denomination.ACE));
        Assert.assertThat(cards.get(0).getDenomination().getPoint(), is(1));
    }

}