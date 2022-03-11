package PokerHandTester;

import java.util.*;

public class deck 
{
    private ArrayList<card> deck = new ArrayList<card>();
    private ArrayList<card> shuffledDeck = new ArrayList<card>();
    public deck()
    {
        for(int i = 0; i<4;i++)
        {
            for(int j = 1; j <14;j++)
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
    public void printDeck()
    {
        int temp = 0;
        while(temp != 52)
        {
            System.out.println(deck.get(temp).suit());
            temp++;
        }
    }
    public void shuffleCards()
    {
        Collections.shuffle(deck);
    }
    public card drawCard()
    {
        Random rand = new Random();
        int choice = rand.nextInt(52);
        card temp = deck.get(choice);
        deck.remove(choice);
        return temp;
        
    }
}
