package PokerHandTester;

public class card 
{
    private String suit;
    private int number;
    public card(String tSuit, int tNumber)
    {
        suit = tSuit;
        number = tNumber;
    }
    public int getNumber()
    {
        return number;
    }
    public String suit()
    {
        return suit;
    }
}
