/*
 * Jatinderjitsingh Minhas
 * Student ID: 998815302
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project.game;

import org.junit.Assert.fail;
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
        BlackJack instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkForWin method, of class BlackJack.
     */
    public void testCheckForWin()
    {
        System.out.println("checkForWin");
        BlackJack instance = null;
        boolean expResult = false;
        boolean result = instance.checkForWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of play method, of class BlackJack.
     */
    public void testPlay()
    {
        System.out.println("play");
        BlackJack instance = null;
        instance.play();
    }
    
}
