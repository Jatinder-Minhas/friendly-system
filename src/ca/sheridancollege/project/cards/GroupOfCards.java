/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Jatinderjitsingh Minhas August 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList();
    }

    /**
     * A method that will get the group of cards as an ArrayList.
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * This method is used to generate the Group of Cards based on the number of 
     * cards.
     */
    public void generateCards()
    {
        Card[] cardHand = new Card[getSize()];
        Random random = new Random();
        
        for(int i = 0; i < cardHand.length; i++)
        {
            Card.RANK value = Card.RANK.values()[random.nextInt(12)];
            Card.SUIT suit = Card.SUIT.values()[random.nextInt(3)];
            
            Card  card = new Card(value, suit);
            
            cardHand[i] = card;
        }
           
        
        cards.addAll(Arrays.asList(cardHand));
    }

}//end class