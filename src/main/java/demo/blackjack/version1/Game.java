package demo.blackjack.version1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD = 2;
    private static final String STOP_RECEIVE_CARD = "0";
    private List<Player> initPhase(CardDeck cardDeck, List<Player> players){
        // 매직 넘버를 활용에 2장의 카드를 생성
        System.out.println("처음 두장의 카드를 각자 뽑겠습니다");
        for (int i = 0; i < INIT_RECEIVE_CARD; i++) {
            for (Player player : players) {
                Card card = cardDeck.draw();
                player.receiveCard(card);
            }
        }
        return players;
    }

    public void play(){
        System.out.println("=====game Start======");
        Scanner sc = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
//        Card card = new Card();
//        Gamer gamer = new Gamer("사용자1");
        CardDeck cardDeck = new CardDeck();
//        System.out.println(cardDeck.toString());
        List<Player> players = Arrays.asList(new Dealer(), new Gamer("사용자1"));
        List<Player> initAfterPlayers = initPhase(cardDeck, players);
        List<Player> playingAfterPlayers = playingPhase(sc, cardDeck, initAfterPlayers);
        Player winner = rule.getWinner(playingAfterPlayers);
        System.out.println("승자는"+ winner.getName());

    }

    public List<Player> playingPhase(Scanner sc, CardDeck cardDeck,List<Player> players){
            List<Player> cardReceivedPlayers;
            while(true){
                cardReceivedPlayers = receivedCardAllPlayer(sc, cardDeck, players);

                if(isAllPlayerTurnOff(cardReceivedPlayers)){
                    break;
                }
            }
        return cardReceivedPlayers;
        }


    private List<Player> receivedCardAllPlayer(Scanner sc, CardDeck cardDeck, List<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName() + "님 카드입니다.");
            if (isReceivedCard(sc)) {
                Card card = cardDeck.draw();
                player.receiveCard(card);
                player.turnOn();

            }else {
                player.turnOff();
            }
        }
        return players;
    }
    private boolean isAllPlayerTurnOff(List<Player> players){
        for (Player player : players) {
            if(player.isTurn()){
                return false;
            }
        }
        return true;
    }

    private boolean isReceivedCard(Scanner sc){
        System.out.println("카드를 뽑겟습니까? 게임을 원하지 않으면 0을 입력하세요");
        return !STOP_RECEIVE_CARD.equals(sc.nextLine());
    }
}
