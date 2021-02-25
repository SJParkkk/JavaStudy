package demo.blackjack.version1;

import java.util.List;

public interface Player {
    void receiveCard(Card card);
    void showCards();
    List<Card> openCard();
    void turnOn();
    void turnOff();
    boolean isTurn();
    String getName();
}
