package My.BlackJackDemo;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private List<Card> cards;
    public Rule() {
        cards = new ArrayList<>();
    }

    public int getScore(List<Card> cards){
        int score = 0;
        for (Card card : cards) {
            score += card.getDenomination().getPoint();
        }
        return score;
    }
    public Player getWinner(List<Player> players){
        Player highestPlayer = null;
        int highestPoint = 0;
        for (Player player : players) {
            int playerPointSum  = getScore(player.openCard());
            if(playerPointSum > highestPoint){
                highestPlayer = player;
                highestPoint = playerPointSum;
            }
        }
        return highestPlayer;
    }
}
