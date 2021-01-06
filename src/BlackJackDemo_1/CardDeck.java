package BlackJackDemo_1;

import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    private static final int CARD_COUNT = 13;
    public List<Card> getCard(){
        return cards;
    }

    public CardDeck(){
        cards = this.generateCard();
    }

    private List<Card> generateCard(){
        cards = new LinkedList<>();
        //PATTERNS별로 13개의 카드가 있음,
        for (Card.Pattern pattern : Card.Pattern.values()) {
            for (Card.Denomination denomination : Card.Denomination.values()) {
                // 왜 널 안하면 에러남?
                //String denomination;
                Card card = new Card(pattern,denomination);
                cards.add(card);
            }
        }
    return cards;
    }

    public Card draw(){
        Card selectedCard = getRandomCard();
        cards.remove(selectedCard);
        return selectedCard;
    }
    private Card getRandomCard(){
        // 이 클래스에서만 활용되는 함수 입니다. -> private
        int size = cards.size();
        int select = (int)(Math.random()*size);
        return cards.get(select);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card);
            sb.append("\n");
        }
        return sb.toString();
    }
}
