package BlackJackDemo_1;

public class Card {
    //private 유무 차이점?
    String pattern;
    String denomination;

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Card{" +
                "pattern='" + pattern + '\'' +
                ", denomination='" + denomination + '\'' +
                '}';
    }
}
