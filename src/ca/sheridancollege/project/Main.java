package ca.sheridancollege.project;

import ca.sheridancollege.project.game.BlackJack;

/**
 * This is the Main Class.
 *
 * @author Jatinderjitsingh Minhas August 2020
 */
public class Main
{
    public static void main(String[] args)
    {
        BlackJack blackjack = new BlackJack("Black Jack");
        System.out.println("Game Name: " + blackjack.getName());
        blackjack.play();
    }
}