package BlackJackDemo_1;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private List<Card> cards;
    public Rule(){
        cards = new ArrayList<>();
    }
    public int getScore(){
        return 0;
    }

    public Player getWinner(List<Player> players){
        Player highestPlayer = null;
        int highestPointSum = 0;
        for (Player player : players) {
            int playerPointSum = getPointSum(player.openCard());
            if(playerPointSum > highestPointSum){
                highestPlayer = player;
                highestPointSum = playerPointSum;
            }
        }
        return highestPlayer;
    }
    private int getPointSum(List<Card> cards){
        int sum = 0;
        for (Card.Denomination denomination : Card.Denomination.values()) {
            sum += denomination.getPoint();
        }
      return sum;
    }

}
