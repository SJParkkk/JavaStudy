package demo.blackjack.version2;

import java.util.ArrayList;
import java.util.List;
/**
 ** App을 기반으로 게임 만들기**/

public class App {
    public static void main(String[] args) {
//        System.out.println("패턴 별로 카드 13장 생성하기");
//        ArrayList<Card> cardList = new ArrayList<>();
//        for(Card.Pattern pattern : Card.Pattern.values()){
//            for(Card.Denomination denomination : Card.Denomination.values()){
//                cardList.add(new Card(pattern,denomination));
//            }
//        }
//        cardList.forEach(card -> System.out.println(card.toString()));
        System.out.println("============카드 13장 생성 후 2장 뽑아서 출력================================");
        GenCard makeCard = new GenCard();
        System.out.println("==============toString()테스트===================");
        makeCard.toString();
        Gamer gamer1 = new Gamer("박소정");
        Dealer dealer1 = new Dealer();
        dealer1.receiveCard(makeCard.draw());
        dealer1.receiveCard(makeCard.draw());
        gamer1.receiveCard(makeCard.draw());
        gamer1.receiveCard(makeCard.draw());
        List<Player> testPlayer = new ArrayList<>();
        testPlayer.add(dealer1);
        testPlayer.add(gamer1);
        Rule rule1 = new Rule();

        System.out.println("승자는" + rule1.getWinner(testPlayer).getName());



//        gamer1.receiveCard(makeCard.draw());
//        gamer1.receiveCard(makeCard.draw());
//
//        System.out.println("랜덤하게 뽑은 한장:" + makeCard.draw());


    }
}
