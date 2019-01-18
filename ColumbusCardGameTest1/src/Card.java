/**
 * The class implements the interface ICard which has the colors(suit) and values(rank)
 * The class also represents a single playing card.
 * The card object cannot be changed once it is instantiated
 */
public class Card implements ICard{
    private final int cardColor;     // ensure immutable, make final
    private final int cardValue;

    /**
     * Variables for the cardColorGroup or Suit
     */
    private static final String[] cardColorGroup = {
            "spades", "hearts", "diamonds", "clovers"
    };


    private String cardName;

    /**
     * Variables for the cardValueGroup or Rank
     */
    private static final String[] cardValueGroup = {
            "joker", "ace","two","three","four","five",
            "six","seven","eight","nine","ten",
            "jack","queen","king"
    };

    /**
     * The constructor creates a new playing card
     * @param color the suit value of the card
     * @param value the rank value of the card
     */
    Card(int color, int value){
        cardColor = color;
        cardValue = value;
        cardName = cardValueGroup[getValue()]+ " of "+ cardColorGroup[getColor()];
    }

    /**
     *
     * @return returns the color or suit of the card
     */
    public int getColor() {
        return cardColor;
    }

    /**
     *
     * @return returns the value or rank of the card
     */
    public int getValue() {
        return cardValue;
    }

    /**
     *
     * @return returns a String or description of the
     * cardValueGroup(rank) and cardColorGroup(suit)
     */
    public String toString(){
        return cardName;
    }


    /**
     * Compares the cards to sort them
     * @param o
     * @return returns an integer (positive, negative, zero) and compares it to the object
     */
    public int compareTo(Object o) {
        ICard iCard = (ICard) o;
        int difference = getValue() - iCard.getValue();
        if (difference == 0) {
            return getColor() - iCard.getColor();
        }
        else {
            return difference;
        }
    }

    /**
     * Compares the cards to see if they have the same value
     * @param o
     * @return checks whether cards have the same color (suit) and value (rank)
     */
    public boolean equals(Object o){
        return compareTo(o) == 0;
    }

}
