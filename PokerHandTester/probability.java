package PokerHandTester;
public class probability
{
    public probability()
    {

    }
    public void pairTester(int runs)
    {
        double total = 0.0;
        for(int i = 0; i<runs;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.twoOfAKind()==1)
                total++;
        }
        System.out.println("The probability of getting a pair in 10,000 hands is : " + total/((double)runs) *100);
    }
    public void twoPairTester(int runs)
    {
        double total = 0.0;
        for(int i = 0; i<runs;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.twoPairs()==2)
                total++;
        }
        System.out.println("The probability of getting two pairs in 10,000 hands is : " + total/((double)runs) *100);
    }
    public void threeKindTester(int runs)
    {
        double total = 0.0;
        for(int i = 0; i<runs;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.threeOfAKind()==1)
                total++;
        }
        System.out.println("The probability of getting a three of a kind in 10,000 hands is : " + total/((double)runs) *100);
    }
    public void fourKindTester(int runs)
    {
        double total = 0.0;
        for(int i = 0; i<runs;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.fourOfAKind()==1)
                total++;
        }
        System.out.println("The probability of getting a four of a kind in 10,000 hands is : " + total/((double)runs) *100);
    }
    public void straightTester(int runs)
    {
        double total = 0.0;
        for(int i = 0; i<runs;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.straightCheck())
                total++;
        }
        System.out.println("The probability of getting a straight in 10,000 hands is : " + total/((double)runs) *100);
    }
    public void flushTester(int runs)
    {
        double total = 0.0;
        for(int i = 0; i<runs;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.flush())
                total++;
        }
        System.out.println("The probability of getting a flush in 10,000 hands is : " + total/((double)runs) *100);
    }
    public void fullHouseTester(int runs)
    {
        double total = 0.0;
        for(int i = 0; i<runs;i++)
        {
            HandEvaluator test = new HandEvaluator();
            if(test.fullHouse())
                total++;
        }
        System.out.println("The probability of getting a full house in 10,000 hands is : " + total/((double)runs) *100);
    }
    public void printAll()
    {
        pairTester(10000);
        twoPairTester(10000);
        threeKindTester(10000);
        fourKindTester(10000);
        straightTester(10000);
        flushTester(10000);
        fullHouseTester(10000);
    }
}
