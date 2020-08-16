/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.cards;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abhinav Garg
 */
public class HandTest {
    
           
    
    public HandTest() {
        
    }

    /**
     * Test of isBlackJack method, of class Hand. for Good Test
     */
    @Test
    public void testIsBlackJackGood() {
        System.out.println("isBlackJackGood");
        int points = 21;
        Hand instance = new Hand();
        boolean expResult = true;
        boolean result = instance.isBlackJack(points);
        assertEquals(expResult, result);
    }
    
    /**
    * Test of isBlackJack method, of class Hand. for Bad Test
    */
    @Test
    public void testIsBlackJackBad() {
        System.out.println("isBlackJackBad");
        int points = 12;
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.isBlackJack(points);
        assertEquals(expResult, result);
    }
    
    /**
     * Test for point method.
     * This test cannot be divided into good, bad and boundary
     */
    @Test
    public void testpoint()
    {
        System.out.println("point");
        Card card = new Card(Card.RANK.FIVE, Card.SUIT.DIAMONDS);
        Hand instance = new Hand();
        int expResult = 5;
        int result = instance.point(card);
        assertEquals(expResult, result);
    }
}
