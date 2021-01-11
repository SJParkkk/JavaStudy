package BlackJackDemo_1;

import java.util.Stack;

public class CardDeck {
    private static Stack<Card> cards;
    public static Stack<Card> getCard(){
        return cards;
    }

    public CardDeck(){
        cards = this.generateCard();
    }

    private Stack<Card> generateCard(){
        cards = new Stack<>();
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
        return cards.pop();
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
