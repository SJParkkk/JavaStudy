package BlackJackDemo_1;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD = 2;
    private void initPhase(CardDeck cardDeck, Gamer gamer, Dealer dealer){
        // 매직 넘버를 활용에 2장의 카드를 생성
        System.out.println("처음 두장의 카드를 각자 뽑겠습니다");
        for (int i = 0; i < INIT_RECEIVE_CARD; i++) {
            Card card = cardDeck.draw();
            gamer.receiveCard(card);

            Card card2 = cardDeck.draw();
            dealer.receiveCard(card2);

        }
    }

    public void play(){
        System.out.println("=====game Start======");
        Scanner sc = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
//        Card card = new Card();
        Gamer gamer = new Gamer();
        CardDeck cardDeck = new CardDeck();
//        System.out.println(cardDeck.toString());
        initPhase(cardDeck, gamer, dealer);
        playingPhase(sc, cardDeck,gamer);

    }

    public void playingPhase(Scanner sc, CardDeck cardDeck,Gamer gamer){
        String gamerInput, dealerInput;
        Boolean isGamerTurn = false,
                isDealerTrun = false;

        while(true){
            System.out.println("카드를 뽑겟습니까? 게임을 원하지 않으면 0을 입력하세요");
            gamerInput = sc.nextLine();

            if("0".equals(gamerInput)){
                isGamerTurn= true;
            }else {
                Card card = cardDeck.draw();
                gamer.receiveCard(card);
            }

            System.out.println("카드를 뽑겟습니까? 게임을 원하지 않으면 0을 입력하세요");
            dealerInput = sc.nextLine();

            if("0".equals(dealerInput)){
                isDealerTrun = true;

            }else {
                Card card = cardDeck.draw();
                gamer.receiveCard(card);
            }

            if(isDealerTrun&&isGamerTurn){
                break;
            }
        }
    }
}
