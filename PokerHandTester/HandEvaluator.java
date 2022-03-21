package PokerHandTester;
import java.nio.channels.NetworkChannel;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class HandEvaluator
{
     private ArrayList<card> hand = new ArrayList<card>();
    public HandEvaluator()
    {
        deck deckHand = new deck();
        deckHand.shuffleCards();
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
            System.out.println(hand.get(temp).getNumber() +" of " + hand.get(temp).suit());
            temp++;
        }
        System.out.println();
    }
    public int twoOfAKind()
    {
        int pairs = 0;
        for(int i = 0; i<hand.size();i++)
        {
            for(int j =i+1; j<hand.size();j++)
            {
                if(hand.get(i).getNumber()==hand.get(j).getNumber())
                    pairs++;
            }
        }
        return pairs;
    }
    public int threeOfAKind()
    {
        int pairs = 0;
        for(int i = 0; i<hand.size();i++)
        {
            for(int j =i+1; j<hand.size();j++)
            {
                for(int k = j+1;k<hand.size();k++)
                {
                    if(numCheck(hand.get(i), hand.get(j))&&numCheck(hand.get(i), hand.get(k))&&numCheck(hand.get(j), hand.get(k)))
                        pairs++;
                }
                
            }
        }
        return pairs;
    }
    public int fourOfAKind()
    {
        int pairs = 0;
        for(int i = 0; i<hand.size();i++)
        {
            for(int j =i+1; j<hand.size();j++)
            {
                for(int k = j+1;k<hand.size();k++)
                {
                    for(int l = k+1;l<hand.size();l++)
                    {
                        if(numCheck(hand.get(i), hand.get(j))&&numCheck(hand.get(i), hand.get(k))&&numCheck(hand.get(j), hand.get(k))&&numCheck(hand.get(i), hand.get(l))&&numCheck(hand.get(j), hand.get(l))&&numCheck(hand.get(l), hand.get(k)))
                            pairs++;
                    }
                }
                
            }
        }
        return pairs;
    }
    public int twoPairs()
    {
        int pairs = 0;
        String firstSuit = " ";
        for(int i = 0; i<hand.size();i++)
        {
            for(int j =i+1; j<hand.size();j++)
            {
                if(hand.get(i).getNumber()==hand.get(j).getNumber())
                {
                    pairs++;
                    firstSuit=hand.get(i).suit();
                }
                   
            }
        }
        return pairs;
    }
    public boolean straightCheck()
    {
        
        if(hand.get(4).getNumber()==hand.get(3).getNumber()+1 && hand.get(3).getNumber()==hand.get(2).getNumber()+1&&hand.get(2).getNumber()==hand.get(1).getNumber()+1 &&hand.get(1).getNumber()==hand.get(0).getNumber()+1)
            return true;
        else if (hand.get(0).getNumber()==hand.get(1).getNumber()+1 && hand.get(1).getNumber()==hand.get(2).getNumber()+1 && hand.get(2).getNumber()==hand.get(3).getNumber()+1 && hand.get(3).getNumber()==hand.get(4).getNumber()+1)
            return true;
        else
            return false;
    }
    public boolean numCheck(card t1, card t2)
    {
        if (t1.getNumber()==t2.getNumber())
            return true;
        else   
            return false;
    }
    public boolean suitCheck(card t1, card t2)
    {
        if (t1.suit()==t2.suit())
            return true;
        else   
            return false;
    }
    public boolean flush()
    {
        if(suitCheck(hand.get(0), hand.get(1)) && suitCheck(hand.get(1), hand.get(2))&&suitCheck(hand.get(2), hand.get(3))&&suitCheck(hand.get(3), hand.get(4)))
            return true;
        else 
            return false;
    }
    public boolean frontHouse()
    {
        boolean pairs = false;
        for(int i = 0; i<hand.size();i++)
        {
            for(int j =i+1; j<hand.size();j++)
            {
                for(int k = j+1;k<hand.size();k++)
                {
                    if(numCheck(hand.get(i), hand.get(j))&&numCheck(hand.get(i), hand.get(k))&&numCheck(hand.get(j), hand.get(k)))
                    {
                        for(int l = k+1;l<hand.size();l++)
                        {
                            for(int m = l+1;m<hand.size();m++)
                            {
                                if(numCheck(hand.get(l), hand.get(m)))
                                    pairs = true;
                                else
                                    pairs = false;
                            }
                        }
                    }
                }     
            }
        }
        return pairs;
    }
    public boolean backHouse()
    {
        boolean pairs = false;
        for(int i = 0; i<hand.size();i++)
        {
            for(int j =i+1; j<hand.size();j++)
            {
                if(numCheck(hand.get(i), hand.get(j)))
                {
                    for(int k = j+1;k<hand.size();k++)
                    {
                        for(int l = k+1;l<hand.size();l++)
                        {
                            for(int m = l+1;m<hand.size();m++)
                            {
                                if(numCheck(hand.get(k), hand.get(l))&&numCheck(hand.get(k), hand.get(m))&&numCheck(hand.get(m), hand.get(l)))
                                    pairs = true;
                                else
                                    pairs = false;
                            }
                        }
                    }
                }
            }
        }
        return pairs;
    }
    public boolean fullHouse()
    {
        
        if(frontHouse()==true||backHouse()==true)
            return true;
        else
            return false;

    }
    
 
            
        
    
    
}