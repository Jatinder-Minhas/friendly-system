package ca.sheridancollege.project.game;

import ca.sheridancollege.project.players.Dealer;
import ca.sheridancollege.project.players.Human;
import java.util.Scanner;

/**
 * This class has the basic methods used to run the game and declaring winner
 *
 * @author Jatinderjitsingh Minhas jun 2020
 * @author Harmeek jun 2020
 * @author Abhinav Garg jun 2020
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
        boolean bustHuman = human.hand.isBust();
        boolean bustDealer = dealer.hand.isBust();
        int dealerPoints = dealer.hand.getPoints();
        int humanPoints = human.hand.getPoints();
        
        if(bustHuman)
            System.out.println("\nYou got busted. Better luck next time.");
        else if(bustDealer)
            System.out.println("\nYou win!!!!. Dealer got busted");
        else if(humanPoints > dealerPoints)
            System.out.println("\nYou win!!!! you have more points then Dealer");
        else if(humanPoints == 21)
            System.out.println("You Win!!!! You got BlackJack.");
        else if(dealerPoints ==  21)
            System.out.println("You lose! You got BlackJack.");
    }
    
    /**
     * This method check whether their is a winner or not.
     * @param bustHuman Boolean value indication whether the human hand is busted or not.
     * @param bustDealer Boolean value indication whether the dealer hand is busted or not.
     * @param humanPoints total points of human hand.
     * @param dealerPoints total points of dealer hand.
     * @return the true if their is a winner.
     */
    public boolean checkForWin(boolean bustHuman, boolean bustDealer,
            int humanPoints, int dealerPoints)
    {
        
        if(bustHuman || bustDealer)
            return true;
        else if(humanPoints > dealerPoints)
            return true;
        else if(humanPoints == 21 || dealerPoints ==  21)
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
        Human human = Human.getInstance(); // Creating Human class object through Singleton pattern
        Dealer dealer = Dealer.getInstance(); // Creating Dealer class object through Singleton pattern
        Scanner input = new Scanner(System.in); // Scanner class for getting user input
        
        System.out.println("Do you want to play the game(y or n): ");
        String choice = input.next(); // User choice for playing game or not
        
        
        
        if(choice.equalsIgnoreCase("y")) // if statement if user said yes
        {
            System.out.println("\nEnter your name: ");
            input.nextLine();
            String name = input.nextLine();
            human.setName(name);
            
            System.out.println("-----------------------------------------------------------------"
                    + "-------------\n");
            
            System.out.println("Player name: " + human.getName()); // print statement to print name of the user
            System.out.print("You Got the following Cards: ");
            System.out.println(human.hand.toString());
            
            
            System.out.println("\nPlayer name: " + dealer.getName()); // print statement to print dealer's name
            System.out.print("Dealer Cards: ");
            System.out.println(dealer.hand.toString());
        
        
        do
        {
            System.out.println("\nPress Enter To Continue....");
            input.nextLine();
            input.nextLine();
            
            System.out.println("------------------------------------------------------------"
                    + "-----------------------------\n");
            if(checkForWin(human.hand.isBust(),dealer.hand.isBust(), // if statement to check winner if anyone
            human.hand.getPoints(), dealer.hand.getPoints()))        // got the blackjack first time
            {
                declareWinner(); // declaring winner and then exit the game.
                break;
            }
            
            System.out.println("Player name: " + human.getName());
            System.out.println("\nYour Turn");
            
            boolean move;
            do // do while loop to get user input until
            {  // user says hit(h) or stand(s)
                move = false;
                
                System.out.println("Do you want to hit or stand (h or s): ");
                choice = input.next();
                if(choice.equalsIgnoreCase("h"))
                { 
                    human.hit();
                    System.out.println("You choose to hit: "); // print statement if user chooses to hit
                    System.out.print("Your Cards: ");
                    System.out.print(human.hand.toString());
                }
                else if(choice.equalsIgnoreCase("s"))
                {
                    System.out.println("\nYou choose to Stand: "); // print statement if user chooses to stand
                    System.out.print("Your Cards: ");
                    System.out.print(human.hand.toString());
                }
                else
                {
                    System.out.println("Invalid move!!!!. Enter again.");
                    move = true;
                }
            }while(move);
            
            if(checkForWin(human.hand.isBust(),dealer.hand.isBust(), // If statement to check winner
            human.hand.getPoints(), dealer.hand.getPoints()))
            {
                declareWinner();
                break;
            }
            
            System.out.println("\nPlayer name: " + dealer.getName());
            System.out.println("Dealer Turn: ");
            
            if(dealer.hit()) // if-else statement if dealer chooses to
            {                // hit
                System.out.println("Dealer choose to hit: "); // print statement if dealer chooses to hit
                System.out.print("Dealer Cards: ");
                System.out.print(dealer.hand.toString());
            }
            else
            {
                System.out.println("Dealer choose to Stand: "); // print statemnt if dealer chooses to stand
                System.out.print("Dealer Cards: ");
                System.out.print(dealer.hand.toString());
            }
            
            if(checkForWin(human.hand.isBust(),dealer.hand.isBust(), // Again if-else statement to check the winner
            human.hand.getPoints(), dealer.hand.getPoints()))
            {
                declareWinner();
                break;
            }

        }
        while(true);
        
    }
    }
}
