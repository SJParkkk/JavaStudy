package demo.blackjack.version2;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Player{
    private List<Card> cards;
    private static final int CAN_NOT_RECEIVE_CARD = 16;
    private static final String name = "딜러";
    private boolean turn;

    public Dealer() {
        cards = new ArrayList<>();
    }

    private int sumPoint(){
        int sum = 0;
        for (Card card : cards) {
            sum += card.getDenomination().getPoint();
        }
        return sum;
    }

    private boolean isReceivedCard(){
        return sumPoint() <= CAN_NOT_RECEIVE_CARD;
    }

    @Override
    public void receiveCard(Card card) {
        if(this.isReceivedCard()){
            this.cards.add(card);
            this.showCard();
        }else{
            System.out.println("카드의 총합이 17이상입니다. 더이상 카드를 받을 수 없습니다.");
        }
    }

    @Override
    public List<Card> openCard() {
        return this.cards;
    }

    @Override
    public void showCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("딜러가 보유한 카드 목록");
        sb.append("\n");
        for (Card card : cards) {
            sb.append(card);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public void turnOff() {
        this.setTurn(false);

    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }

    public String getName() {
        return name;
    }

}
