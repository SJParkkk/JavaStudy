package BlackJackDemo_1;

public class Card {
    //private 유무 차이점?
    String pattern;
    String denomination;
    int point;
    public Card(String pattern, int index){
        this.pattern = pattern;
        this.denomination = this.numberToDenomination(index);
        this.point = this.numberToPoint(index);
    }
    public String getPattern() {
        return pattern;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
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

    private int numberToPoint(int number) {
        if(number >= 11){
            return 10;
        }
        return number;
    }

    private String numberToDenomination(int number) {
        if(number == 1){
            return "A";
        }else if(number == 11){
            return "J";
        }else if(number == 12){
            return "Q";
        }else if(number == 13){
            return  "K";
        }
        return String.valueOf(number);
    }

    @Override
    public String toString() {
        return "Card{" +
                "pattern='" + pattern + '\'' +
                ", denomination='" + denomination + '\'' +
                '}';
    }
}
