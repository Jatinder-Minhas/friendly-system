/*
 * Jatinderjitsingh Minhas
 * Student ID: 998815302
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project.game;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author jatinder
 */
public class BlackJackTest
{
    
    public BlackJackTest()
    {
    }


    /**
     * Test of declareWinner method, of class BlackJack.
     */
    @Test
    public void testDeclareWinner()
    {
        System.out.println("declareWinner");
        BlackJack instance = new BlackJack("");
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkForWin method, of class BlackJack. for Good Test.
     */
    @Test
    public void testCheckForWinGood()
    {
        System.out.println("checkForWinGood");
        BlackJack instance = new BlackJack("");
        boolean humanBust = true;
        boolean dealerBust = true;
        int humanPoints = 21;
        int dealerPoints = 21;
        boolean expResult = true;
        boolean result = instance.checkForWin(humanBust,dealerBust,
                humanPoints,dealerPoints);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of checkForWin method, of class BlackJack. for Bad Test.
     */
    @Test
    public void testCheckForWinBad()
    {
        System.out.println("checkForWinBad");
        BlackJack instance = new BlackJack("");
        boolean humanBust = false;
        boolean dealerBust = false;
        int humanPoints = 4;
        int dealerPoints = 8;
        boolean expResult = false;
        boolean result = instance.checkForWin(humanBust,dealerBust,
                humanPoints,dealerPoints);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkForWin method, of class BlackJack. for Boundary Test.
     */
    @Test
    public void testCheckForWinBoundary()
    {
        System.out.println("checkForWinBoundary");
        BlackJack instance = new BlackJack("");
        boolean humanBust = true;
        boolean dealerBust = false;
        int humanPoints = 7;
        int dealerPoints = 8;
        boolean expResult = true;
        boolean result = instance.checkForWin(humanBust,dealerBust,
                humanPoints,dealerPoints);
        assertEquals(expResult, result);
    }
    
}
