package PokerHandTester;
import java.util.*;

public class HandEvaluator
{
    private ArrayList<card> hand = new ArrayList<card>();
    public HandEvaluator()
    {
        deck deckHand = new deck();
        hand.add(deckHand.drawCard());
        hand.add(deckHand.drawCard());
        hand.add(deckHand.drawCard());
        hand.add(deckHand.drawCard());
        hand.add(deckHand.drawCard());
        
    }
    public void printHand()
    {
        int temp = 0;
        while(temp != hand.size())
        {
            System.out.println(hand.get(temp).getNumber() +" " + hand.get(temp).suit());
            temp++;
        }
    }
}