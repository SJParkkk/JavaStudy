package My.BlackJackDemo;

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

        System.out.println("랜덤하게 뽑은 한장:" + makeCard.draw());

    }
}
