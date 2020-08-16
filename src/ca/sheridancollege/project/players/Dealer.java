package ca.sheridancollege.project.players;

import ca.sheridancollege.project.cards.Hand;

/**
 * This class models the Dealer and contain methods related to the BlackJack Dealer.
 * @author Jatinderjitsingh Minhas jun 2020
 */
public class Dealer extends BlackjackPlayer
{
    public Hand hand; // stores the hand of cards of the dealer
    
    public static Dealer dealer = null;

    private Dealer(String name)
    {
        super(name);
        hand = new Hand();
    }
    
    public static Dealer getInstance(){
        if (dealer==null){
            dealer =new Dealer("Dealer");
        }
        return dealer;
    }//end of getInstance
    
     /**
     * It let the Dealer to hit.
     * @return Boolean value of whether the player choose to hit or not.
     */
    @Override
    public boolean hit()
    {
        if(hand.getPoints()<= 17)
        {
            hand.addCard();
            return true;
        }
        else {
            return false;
        }
    }
    
}
