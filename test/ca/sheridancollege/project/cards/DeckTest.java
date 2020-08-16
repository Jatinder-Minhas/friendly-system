/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.cards;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Abhinav Garg
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    public void setUp() {
    }

    /**
     * Test of borrowCard method, of class Deck.
     */
    @Test
    public void testBorrowCard() {
        System.out.println("borrowCard");
        Deck instance = new Deck();
        Card lastCard = new Card(Card.RANK.FIVE, Card.SUIT.HEARTS);
        instance.deck.add(lastCard); // For this test to work change access modifier of deck array list to public
        Card expResult = lastCard;
        Card result = instance.borrowCard();
        assertEquals(expResult, result);
        
    }
    
}
