package demo.blackjack.version1;

import java.util.ArrayList;
import java.util.List;
/*
    Gamer의 역할은 아래와 같습니다.
    - 추가로 카드를 받는다.
    - 뽑은 카드를 소유한다.
    - 카드를 오픈한다.
*/
public class Gamer implements Player{
    private final String name;
    private List<Card> cards;
    public Gamer(String name){
        cards = new ArrayList<>();
        this.name = name;
    }
    public void receiveCard(Card card){
        this.cards.add(card);
        this.showCards();
    }
    public List<Card> openCard(){
        return this.cards;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public boolean isTurn() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void showCards(){
        StringBuilder sb = new StringBuilder();
        sb.append( this.name +"보유한 카드는\n");
        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
       }
        System.out.println(sb.toString());
    }
}
