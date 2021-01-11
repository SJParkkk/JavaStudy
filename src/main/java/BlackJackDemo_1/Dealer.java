package BlackJackDemo_1;

import java.util.ArrayList;
import java.util.List;
/*
- 추가로 카드를 받는다.
- 단, 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 받을 수 없다.
- 뽑은 카드를 소유한다.
- 카드를 오픈한다.
-
* */


public class Dealer implements Player{
    private final String NAME = "딜러";
    private ArrayList<Card> cards;
    private static final int CAN_RECEIVE_POINT = 16;
    public Dealer(){
        cards = new ArrayList<>();
    }
    public void receiveCard(Card card){
        if(this.isReceivedCard()){
            this.cards.add(card);
            this.showCards();
        }else{
            System.out.println("17점이 넘어서 카드를 받을 수 없습니다.");
        }

    }

    @Override
    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append(NAME+ "이 보유한 카드는 \n");
        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }


    private boolean isReceivedCard(){
        return this.getPoint() <= CAN_RECEIVE_POINT;
    }

    private int getPoint(){
        int sumPoint=0;
        for (Card.Denomination denomination : Card.Denomination.values()) {
            sumPoint += denomination.getPoint();
        }
        return sumPoint;
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
        return NAME;
    }
}
