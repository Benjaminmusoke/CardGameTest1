import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

/**
 * This class represents a deck of playing cards which has Suits like spades,
 * hearts, clovers and diamonds. It also has value starting from
 * ace, 2, 3, 4, 5, 6, 7, 8 ,9, jack, queen and king
 */
public class Deck implements Iterator{
    private ArrayList<Card> cardList;
    private int usedCards;

    /**
     * The constructor creates an empty deck of cards
     */
    Deck(){
        cardList = new ArrayList<>();

        for(int color = ICard.SPADES; color <= ICard.CLOVERS; color++){
            for (int value = 1; value <= 13; value++){
                cardList.add(new Card(color, value));
            }
        }
        shuffleDeck();
    }

    /**
     * The cards in the deck are shuffled
     */
    private void shuffleDeck(){
        Collections.shuffle(cardList);
        usedCards = 0;
    }

    /**
     *
     * @return used cards if less than card list
     */
    public boolean hasNext() {
        return usedCards < cardList.size();
    }

    /**
     * Gets the card list from the interface
     * @return a card from the deck
     */
    public Object next() {
        ICard card = cardList.get(usedCards);
        usedCards++;
        return card;
    }


    /**
     * Removes card from the deck
     */
    public void remove() {
        throw new UnsupportedOperationException();
    }
}



