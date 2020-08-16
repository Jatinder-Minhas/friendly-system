package ca.sheridancollege.project.cards;

import java.util.ArrayList;

/**
 * This class Generate and model the Deck of cards.
 *
 * @author Jatinderjitsingh Minhas jun 2020
 */
public class Deck 
{
    private ArrayList<Card> deck; // ArrayList of type Card to store Deck
    private GroupOfCards group;
    
    
    public Deck()
    {
        GroupOfCards group = new GroupOfCards(52);
        deck = new ArrayList();
        group.generateCards();
        deck.addAll(group.getCards());
    }
    
    /**
     * This method borrow the card from from the deck.
     * @return return the object of Card containing the borrowed card.
     */
    public Card borrowCard()
    {
       Card returnCard;
        
        if(deck.size() < 1)
        {
            fillDeck();
        }
        
        
        returnCard = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        
        return returnCard;
    }
    
    
    /**
     * This method fill the deck.
     */
    private void fillDeck()
    {
        group.generateCards();
        deck.addAll(group.getCards());
    }
    
}
