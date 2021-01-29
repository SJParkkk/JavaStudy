package My.BlackJackDemo;

import java.util.List;

public interface Player {
    void receiveCard(Card card);
    List<Card> openCard();
    void showCard();
    String getName();
    void turnOn();
    void turnOff();
    boolean isTurn();

}
