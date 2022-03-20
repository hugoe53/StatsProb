package PokerHandTester;

public class cardTester 
{
    public static void main(String[] args)
    {
        probability test = new probability();
        test.pairTester();
        test.twoPairTester();
        test.threeKindTester();
        test.fourKindTester();
        test.straightTester();
        test.flushTester();
        test.fullHouseTester();
    }
    
}
