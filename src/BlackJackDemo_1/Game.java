package BlackJackDemo_1;

public class Game {
    public void play(){
        System.out.println("=====game Start======");
//        Scanner sc = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
        Card card = new Card();
        Gamer gamer = new Gamer();
        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.toString());

    }
}
