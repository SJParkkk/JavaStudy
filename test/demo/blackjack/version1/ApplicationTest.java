package demo.blackjack.version1;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ApplicationTest {
    private CardDeck cardDeck;
    private List<Card> cards;

    @BeforeEach
    public void setup(){
        cardDeck = new CardDeck();
        cards = CardDeck.getCard();
    }

    @Test
    public void test_카드댁생성(){
        CardDeck cardDeck = new CardDeck();
        List<Card> cards = cardDeck.getCard();
        assertThat(cards.get(0).getPattern()).isEqualTo(Card.Pattern.SPADE);
        assertThat(cards.get(13).getPattern()).isEqualTo(Card.Pattern.HEART);
    }
    @Test
    public void test_카드끗수비교(){
        cardDeck = new CardDeck();
        cards = CardDeck.getCard();
        assertThat(cards.get(0).getDenomination()).isEqualTo(Card.Denomination.ACE);
        assertThat(cards.get(0).getDenomination().getPoint()).isEqualTo(1);
    }

}