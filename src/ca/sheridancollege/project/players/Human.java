package ca.sheridancollege.project.players;

import ca.sheridancollege.project.cards.Hand;

/**
 * This class model the basic Human player
 * @author Jatinderjitsingh Minhas August 2020
 * @auther Harmeek August 2020
 */
public class Human extends BlackjackPlayer{

    public Hand hand; // stores the hand of cards of the player.
    
    public static Human human = null;

    private Human(String name)
    {
        super(name);
        hand = new Hand();
    }   

    public static Human getInstance()
    {
        if (human==null)
        {
            human =new Human("");
        }
        
        return human;
    }//end of getInstance
    
     /**
     * This method let the player to hit.
     * @return Boolean value of whether the player choose to hit or not.
     */
    @Override
    public boolean hit()
    {
        hand.addCard();
        return true;
    }
    
}