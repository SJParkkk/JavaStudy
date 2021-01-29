package My.BlackJackDemo;

import java.util.ArrayList;
import java.util.List;
// 카드 뭉치 52장 생성 클래스
//Q 왜 generateCard에서 cardList에 new ArrayList<>(); 안해주면 nullpointException
// 만들어진 카드를 2장 랜덤하게 뽑는 것

public class GenCard {
    private List<Card> cardList;

    public GenCard() {
        cardList = this.generateCard();
    }

    public List<Card> getCardList() {
        return cardList;
    }

    private List<Card> generateCard() {
        cardList = new ArrayList<>();
        for (Card.Pattern pattern : Card.Pattern.values()) {
            for (Card.Denomination denomination : Card.Denomination.values())
                cardList.add(new Card(pattern, denomination));
        }
        return cardList;
    }

    public Card draw() {
        return getRandomCard();
    }

    private Card getRandomCard() {
        int len = cardList.size();
        int select = (int) (Math.random() * len) + 1;
        return cardList.get(select);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        System.out.println("toString 테스트");
        for(Card card : cardList){
            sb.append(card);
            sb.append("\n");
        }
        return sb.toString();
    }
}
