package demo.blackjack.version2;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player{
    private List<Card> cards;
    private String name;
    private boolean turn;

    public Gamer(String name) {
        cards = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void receiveCard(Card card) {
        this.cards.add(card);
        this.showCard();

    }

    @Override
    public List<Card> openCard() {
        return this.cards;
    }

    @Override
    public void showCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("게이머가 소유한 카드 목록");
        sb.append("\n");
        for (Card card : cards) {
            sb.append(card);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    @Override
    public void turnOff() {
        this.setTurn(false);
    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }
    @Override
    public String getName() {
        return name;
    }

}
