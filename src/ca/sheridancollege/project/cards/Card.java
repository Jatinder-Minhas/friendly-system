/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project.cards;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Jatinderjitsingh Minhas August 2020
 */
public class Card {
    
    /**
     * it stores the Rank cards values.
     */
    public enum RANK
    {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    };
    
    /**
     * it stores the Suit values.
     */
    public enum SUIT
    {
        SPADES, HEARTS, DIAMONDS, CLUBS;
    };
    
    private RANK rank; // stores the Rank/value of the Card.
    private SUIT suit; // stores the Suit of the Card
    
    public Card(RANK rank, SUIT suit)
    {
        setRank(rank);
        setSuit(suit);
    }
    
    /**
     * This method is used to set the Rank/value of the card.
     * @param rank The rank/value to be set.
     */
    public void setRank(RANK rank)
    {
        this.rank = rank;
    }
    
    /**
     * This method is used to set the suit of the card.
     * @param suit The suit to be set.
     */
    public void setSuit(SUIT suit)
    {
        this.suit = suit;
    }

    /**
     * This method returns the rank/value of the card.
     * @return The Rank of card to be returned.
     */
    public RANK getRank()
    {
        return rank;
    }

    /**
     * This method returns the suit of the card.
     * @return The suit of the card to be returned.
     */
    public SUIT getSuit()
    {
        return suit;
    }

}
