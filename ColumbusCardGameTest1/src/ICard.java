/**
 * The interface class is responsible for the details or values of
 * the cardColors (suit) which are then compared later on using the Comparable interface
 */
public interface ICard extends Comparable
{
    int SPADES = 0;
    int HEARTS = 1;
    int DIAMONDS = 2;
    int CLOVERS = 3;

    int getColor();
    int getValue();
}
