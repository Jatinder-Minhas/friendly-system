package ca.sheridancollege.project.players;

/**
 * This is the general class for blackjack player
 *
 * @author Jatinderjitsingh Minhas August 2020
 * @author Harmeek August 2020
 */
public abstract class BlackjackPlayer extends Player {

    public BlackjackPlayer(String name)
    {
        super(name);
    }
    
    /**
     * This method is to be overwritten.
     * It let the player to hit.
     * @return Boolean value of whether the player choose to hit or not.
     */
    public abstract boolean hit();

}
