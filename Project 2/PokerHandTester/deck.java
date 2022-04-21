package PokerHandTester;

import java.util.*;

public class deck 
{
    private ArrayList<card> deck = new ArrayList<card>();
    /**
     * This is the deck constructor that assigns numbers and suits.
     */
    public deck()
    {
        for(int i = 0; i<4;i++)
        {
            for(int j = 1; j <=13;j++)
            {
            if(i==0)
            {
                card card = new card("Spade",j);
                deck.add(card);
            }
            else if(i==1)
            {
                card card = new card("Clover",j);
                deck.add(card);
                
            }
            else if(i==2)
            {
                card card = new card("Heart",j);
                deck.add(card);
                 
            }
            else if(i==3)
            {
                card card = new card("Diamond",j);
                deck.add(card);
                
            }
        }
    }
}
    //This method is used to print the deck.
    public void printDeck()
    {
        int temp = 0;
        while(temp != 52)
        {
            System.out.println(deck.get(temp).suit());
            temp++;
        }
    }
    /**
     * This method shuffles the cards. Harry Zhu helped me with this method.
     */
    public void shuffleCards()
    {
        Collections.shuffle(deck);
    }
    //This method draws a card and removes it from the deck. Harry Zhu helped me with this method.
    public card drawCard()
    {

        card temp = deck.get(0);
        deck.remove(0);
        return temp;
        
    }
}
