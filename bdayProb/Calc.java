package bdayProb;

public class Calc 
{
	public void run(int tRuns, int tClassSize)
	{
		int trialLoop=tRuns;
		int runTotal=0;
		while(trialLoop!=0)
		{
			int sameDays=0;
			int runsLoop = tRuns;
			Person[] test = new Person[tClassSize];
			for (int i =0; i<tClassSize;i++)
			{
				test[i] = new Person();
				System.out.println(test[i].getBday());
			}
			System.out.println("---------");
			while(runsLoop!=0)
			{
				sameDays=0;
				for(int i =0; i<test.length;i++)
				{
					for(int j =i+1; j<test.length;j++)
					{
						if(test[i].getBday()==test[j].getBday())
						{
							sameDays++;
							System.out.println("Here " +test[i].getBday() +" "+ test[j].getBday());
							
						}
					}
					
				}
				runTotal+=sameDays;
				runsLoop--;
			}
			trialLoop--;
		}
		System.out.println("There were "+runTotal/tRuns+" pair(s) that had the same birthday in a class of "+ tClassSize+" and after "+ tRuns +" runs.");
	}
}
