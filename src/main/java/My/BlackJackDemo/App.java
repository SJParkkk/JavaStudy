package My.BlackJackDemo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("패턴 별로 카드 13장 생성하기");
        ArrayList<Card> cardList = new ArrayList<>();
        for(Card.Pattern pattern : Card.Pattern.values()){
            for(Card.Denomination denomination : Card.Denomination.values()){
                cardList.add(new Card(pattern,denomination));
            }
        }
        cardList.forEach(card -> System.out.println(card.toString()));
    }
}
