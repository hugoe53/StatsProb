package PokerHandTester;
public class probability
{
    public probability()
    {

    }
    public void pairTester()
    {
        double total = 0.0;
        for(int i = 0; i<10000;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.twoOfAKind()==1)
                total++;
        }
        System.out.println("The probability of getting a pair in 10,000 hands is : " + total/10000.0 *100);
    }
    public void twoPairTester()
    {
        double total = 0.0;
        for(int i = 0; i<10000;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.twoPairs()==2)
                total++;
        }
        System.out.println("The probability of getting two pairs in 10,000 hands is : " + total/10000.0 *100);
    }
    public void threeKindTester()
    {
        double total = 0.0;
        for(int i = 0; i<10000;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.threeOfAKind()==1)
                total++;
        }
        System.out.println("The probability of getting a three of a kind in 10,000 hands is : " + total/10000.0 *100);
    }
    public void fourKindTester()
    {
        double total = 0.0;
        for(int i = 0; i<10000;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.fourOfAKind()==1)
                total++;
        }
        System.out.println("The probability of getting a four of a kind in 10,000 hands is : " + total/10000.0 *100);
    }
    public void straightTester()
    {
        double total = 0.0;
        for(int i = 0; i<10000;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.straightCheck())
                total++;
        }
        System.out.println("The probability of getting a straight in 10,000 hands is : " + total/10000.0 *100);
    }
    public void flushTester()
    {
        double total = 0.0;
        for(int i = 0; i<10000;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.flush())
                total++;
        }
        System.out.println("The probability of getting a flush in 10,000 hands is : " + total/10000.0 *100);
    }
    public void fullHouseTester()
    {
        double total = 0.0;
        for(int i = 0; i<10000;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.fullHouse())
                total++;
        }
        System.out.println("The probability of getting a pair in 10,000 hands is : " + total/10000.0 *100);
    }
    public void printAll()
    {
        pairTester();
        twoPairTester();
        threeKindTester();
        fourKindTester();
        straightTester();
        flushTester();
        fullHouseTester();
    }
}
