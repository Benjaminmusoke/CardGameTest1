import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /**
     * Checks to see whether the card deck is sorted
     * @param list card list
     * @returns true when the card is sorted
     */
    private static boolean isSorted(ICard[] list){
        for(int i= 1; i < list.length; i++){
            if (list[i-1].compareTo(list[i]) > 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Adds or deals a card to a player
     * @param cards in a deck
     */
    private static void dealCards(ArrayList cards){
        for (Object card : cards) {
            System.out.println(card);
        }
    }


    /**
     * Main method runs the whole application
     * @param args
     */
    public static void main(String[] args){
        Deck deck = new Deck();
        ArrayList list = new ArrayList();
        while (deck.hasNext()){
            list.add(deck.next());
        }

        dealCards(list);
        System.out.println("************************************************************************");
        System.out.println("************************************************************************");

        Collections.sort(list);
        dealCards(list);

        System.out.println("************************************************************************");
        System.out.println("************************************************************************");
        ICard[] iCards = (ICard[]) list.toArray(new ICard[0]);
        System.out.println("sorted? " + isSorted(iCards));

        dealCards(list);
        System.out.println("You're now dealt a card: " + list.get(5));

    }
}
