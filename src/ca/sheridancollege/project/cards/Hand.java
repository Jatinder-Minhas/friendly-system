package ca.sheridancollege.project.cards;

import java.util.ArrayList;

/**
 * This class models the Hand of Card for the Player
 *
 * @author Jatinderjitsingh Minhas jun 2020
 */
public class Hand 
{
    public GroupOfCards group;
    private Deck deck;
    private int points;
    private ArrayList<Card> hand;
    public boolean bust;
    
    public Hand()
    {
        deck = new Deck();
        hand = new ArrayList();
        group = new GroupOfCards(2);
        group.generateCards();
        hand.addAll(group.getCards());
    }
    
    /**
     * This method adds a card to the player hand.
     */
    public void addCard()
    {
        Card card = deck.borrowCard();
        hand.add(card);
    }
    
    /**
     * this method checks if the hand of card is bust or not.
     * @return The true/false value
     */
    public Boolean isBust()
    {
        calculatePoints();
        bust = points > 21;
                    
        return bust;
    }
    
    /**
     * The method calculate the total points of the hand.
     * @return 
     */
    private void calculatePoints()
    {
        points = 0;
        for(int i = 0; i < hand.size(); i++)
        {
                points += point(hand.get(i));
        }
    }
    
    /**
     * This method return the total points of the hand.
     * @return 
     */
    public int getPoints()
    {
        calculatePoints();
        return points;
    }
    
    /**
     * This method is used to return the value of the single card.
     * @param card The object of Card used to get the card. 
     * @return the value of card to be returned.
     */
    private int point(Card card)
    {
        
        switch (card.getRank())
        {
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case JACK:
                return 10;
            case QUEEN:
                return 10;
            case KING:
                return 10;
            case ACE:
                if(points + 11 > 21)
                    return 1;
                else
                    return 11;
            default:
                    return 0;
        }
    }
    
    /**
     * This method returns the number of cards in the player hand.
     * @return the number of cards to be returned.
     */
    public int getSize()
    {
        return hand.size();
    }
    
    public boolean isBlackJack(int points)
    {
        return points == 21;
    }
    
    /**
     * The overwritten toString Method.
     * @return The String to be returned.
     */
    @Override
    public String toString()
    {
        String s = "";
        
        for(Card c : hand)
        {
            s += c.getRank().toString() + " ";
        }
        
        return s;
    }
}
