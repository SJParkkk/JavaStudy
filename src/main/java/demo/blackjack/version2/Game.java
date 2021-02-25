package demo.blackjack.version2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 1.카드 뭉치 생성 ok
 * 2.딜러와 게이머에게 카드를 2장씩 배부 : initPlay() ok
 * 3. 카드 리스트를 비교해서 승자 판단 : ok
 * 4.*카드를 더 뽑을지말지 입력받아서 하는건 나중에 구현
 *  - 규칙에 보면 딜러는 한명 게이머는 여러명일 수 있다고 함
 *  playingPhase()구현 ok
 *  Player 인터페이스에 boolean turn; 변수 선언 후 setTurn 메소드를 활용해서 flag로 사용
 *  isReceivedCard()
 *  isAllPlayerTurnoff()
 *
 *  */
public class Game {
    private final static int INIT_RECEIVE_CARD = 2;
    private final static String STOP_RECEIVE_CARD = "0";
    public List<Player> initPlay(GenCard genCard, List<Player> players){
        System.out.println("처음 카드 2장을 뽑겠습니다.");
        for (int i = 0; i < INIT_RECEIVE_CARD; i++) {
            for (Player player : players) {
                Card card = genCard.draw();
                player.receiveCard(card);
            }
        }
        return players;
    }

    public List<Player> playingPhase(Scanner sc, GenCard genCard, List<Player> player){
        List<Player> cardReceivedPlayer;
        while(true){
            cardReceivedPlayer = receiveCardAllPlayers(sc,genCard,player);
            if(isAllPlayerTurnOff(player)){
                break;
            }
        }
        return cardReceivedPlayer;
    }

    private List<Player> receiveCardAllPlayers(Scanner sc, GenCard genCard, List<Player> players){
        for (Player player : players) {
            System.out.println(player.getName() + "님 차례입니다.");
            if(isReceivedCard(sc)){
                Card card = genCard.draw();
                player.receiveCard(card);
                player.turnOn();
            }else{
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
        System.out.println("카드를 더 뽑겟습니까? 종료를 원하시면 0을 입력하세요");
        return !STOP_RECEIVE_CARD.equals(sc.nextLine());
    }

    public void play(){
        System.out.println("=========BlackJack=========");
        Scanner sc = new Scanner(System.in);
        GenCard genCard = new GenCard();
        Rule rule = new Rule();
        List<Player> players= Arrays.asList(new Dealer(), new Gamer("박재선"));
        List<Player> initAfterPlayers = initPlay(genCard,players);
        List<Player> playAfterPlayers = playingPhase(sc, genCard, initAfterPlayers);
        Player winner = rule.getWinner(playAfterPlayers);
        System.out.println("승자는" + winner.getName());
//        System.out.println(winner);

    }

    public static void main(String[] args) {
        System.out.println("게임 init 테스트 해보기");
        Game game = new Game();
        game.play();
    }
}
