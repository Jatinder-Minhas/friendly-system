package ca.sheridancollege.project.game;

import ca.sheridancollege.project.players.Dealer;
import ca.sheridancollege.project.players.Human;
import java.util.Scanner;

/**
 * This class has the basic methods used to run the game and declaring winner
 *
 * @author Jatinderjitsingh Minhas jun 2020
 * @author Harmeek jun 2020
 */
public class BlackJack extends Game
{

    public BlackJack(String name)
    {
        super(name);
    }
    
    /**
     * This method is used to declare winner of the game.
     */
    @Override
    public void declareWinner()
    {   
        Human human = Human.getInstance();
        Dealer dealer = Dealer.getInstance();
        
        if(human.hand.isBust())
            System.out.println("\nYou got busted. Better luck next time.");
        else if(dealer.hand.isBust())
            System.out.println("\nYou win!!!!. Dealer got busted");
        else if(human.hand.getPoints() > Dealer.dealer.hand.getPoints())
            System.out.println("\nYou win!!!! you have more points then Dealer");
        else if(human.hand.getPoints() == 21)
            System.out.println("You Win!!!! You got BlackJack.");
        else if(Dealer.dealer.hand.getPoints() ==  21)
            System.out.println("You lose! You got BlackJack.");
    }
    
    /**
     * This method check whether their is a winner or not.
     * @return the true if their is a winner.
     */
    public boolean checkForWin()
    {
        Human human = Human.getInstance();
        Dealer dealer = Dealer.getInstance();
        
        if(human.hand.isBust())
            return true;
        else if(dealer.hand.isBust())
            return true;
        else if(human.hand.getPoints() > Dealer.dealer.hand.getPoints())
            return true;
        else if(human.hand.getPoints() == 21 || Dealer.dealer.hand.getPoints() ==  21)
            return true;
        else
            return false;
    }

    /**
     * This is the method which will let the user to play the game.
     */
    @Override
    public void play()
    {
        Human human = Human.getInstance();
        Dealer dealer = Dealer.getInstance();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to play the game(y or n): ");
        String choice = input.next();
        
        
        
        if(choice.equalsIgnoreCase("y"))
        {
            System.out.println("\nEnter your name: ");
            input.nextLine();
            String name = input.nextLine();
            human.setName(name);
            
            System.out.println("-----------------------------------------------------------------"
                    + "-------------\n");
            
            System.out.println("Player name: " + human.getName());
            System.out.print("You Got the following Cards: ");
            System.out.println(human.hand.toString());
            
            
            System.out.println("\nPlayer name: " + dealer.getName());
            System.out.print("Dealer Cards: ");
            System.out.println(dealer.hand.toString());
        
        
        do
        {
            System.out.println("\nPress Enter To Continue....");
            input.nextLine();
            input.nextLine();
            
            System.out.println("------------------------------------------------------------"
                    + "-----------------------------\n");
            if(checkForWin())
            {
                declareWinner();
                break;
            }
            
            System.out.println("Player name: " + human.getName());
            System.out.println("\nYour Turn");
            
            boolean move;
            do
            {
                move = false;
                
                System.out.println("Do you want to hit or stand (h or s): ");
                choice = input.next();
                if(choice.equalsIgnoreCase("h"))
                { 
                    human.hit();
                    System.out.println("You choose to hit: ");
                    System.out.print("Your Cards: ");
                    System.out.print(human.hand.toString());
                }
                else if(choice.equalsIgnoreCase("s"))
                {
                    System.out.println("\nYou choose to Stand: ");
                    System.out.print("Your Cards: ");
                    System.out.print(human.hand.toString());
                }
                else
                {
                    System.out.println("Invalid move!!!!. Enter again.");
                    move = true;
                }
            }while(move);
            
            if(checkForWin())
            {
                declareWinner();
                break;
            }
            
            System.out.println("Player name: " + dealer.getName());
            System.out.println("\nDealer Turn: ");
            
            if(dealer.hit())
            {
                System.out.println("Dealer choose to hit: ");
                System.out.print("Dealer Cards: ");
                System.out.print(dealer.hand.toString());
            }
            else
            {
                System.out.println("Dealer choose to Stand: ");
                System.out.print("Dealer Cards: ");
                System.out.print(dealer.hand.toString());
            }
            
            if(checkForWin())
            {
                declareWinner();
                break;
            }

        }
        while(true);
        
    }
    }
}
