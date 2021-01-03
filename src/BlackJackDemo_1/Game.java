package BlackJackDemo_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD = 2;
    private static final String STOP_RECEIVE_CARD = "0";
    private void initPhase(CardDeck cardDeck, List<Player> players){
        // 매직 넘버를 활용에 2장의 카드를 생성
        System.out.println("처음 두장의 카드를 각자 뽑겠습니다");
        for (int i = 0; i < INIT_RECEIVE_CARD; i++) {
            for (Player player : players) {
                Card card = cardDeck.draw();
                player.receiveCard(card);
            }
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
        List<Player> players = Arrays.asList(new Dealer(), new Gamer());
        initPhase(cardDeck, players);
        playingPhase(sc, cardDeck, players);

    }

    public void playingPhase(Scanner sc, CardDeck cardDeck,List<Player> players){
        while(true){
            boolean isAllPlayerTurnoff = receivedCardAllPlayer(sc, cardDeck, players);
            if(isAllPlayerTurnoff){
                break;
            }

        }
    }

    private boolean receivedCardAllPlayer(Scanner sc, CardDeck cardDeck, List<Player> players) {
        boolean isAllPlayerTurnoff = true;
        for (Player player : players) {
            if (isReceivedCard(sc)) {
                Card card = cardDeck.draw();
                player.receiveCard(card);
                isAllPlayerTurnoff = false;

            }else {
                isAllPlayerTurnoff = true;
            }
        }
        return isAllPlayerTurnoff;
    }

    private boolean isReceivedCard(Scanner sc){
        System.out.println("카드를 뽑겟습니까? 게임을 원하지 않으면 0을 입력하세요");
        return !STOP_RECEIVE_CARD.equals(sc.nextLine());
    }
}
