package My.BlackJackDemo;

public class Card {
    private Pattern pattern;
    private Denomination denomination;

    public Card(Pattern pattern, Denomination denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    enum Pattern{
        CLOVER("clover"),
        SPACE("space"),
        HEART("heart"),
        DIAMOND("diamond");

        private String value;

        Pattern(String value) {
            this.value = value;
        }
    }
    enum Denomination{
        ACE("A",1),
        TWO("2",2),
        THREE("3",3),
        FOUR("4",4),
        FIVE("5",5),
        SIX("6",6),
        SEVEN("7",7),
        EIGHT("8",8),
        NINE("9",9),
        TEN("10",10),
        JACK("J",10),
        QUEEN("Q",10),
        JOKER("K",10);

        private String mark;
        private int point ;

        Denomination(String mark, int point) {
            this.mark = mark;
            this.point = point;
        }
    }

    public Pattern getPattern() {
        return pattern;
    }


    public Denomination getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return "Card{" +
                "pattern=" + pattern +
                ", denomination=" + denomination +
                '}';
    }

}
