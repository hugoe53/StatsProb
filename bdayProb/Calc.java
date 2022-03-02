package bdayProb;

public class Calc 
{
	public void run(int tRuns, int tClassSize)
	{
		int trialLoop=tRuns;
		double runTotal=0;
		int sameDays=0;
		while(trialLoop!=0)
		{
			
			Person[] test = new Person[tClassSize];
			for (int i =0; i<tClassSize;i++)
			{
				test[i] = new Person();

			}
			for(int i = 0; i<test.length;i++)
			{
				sameDays = 0;
				for (int j= i+1; j<test.length;j++)
				{
					if(test[i].getBday()==test[j].getBday())
					{
						sameDays++;
						break;
					}
						
				}
				if(sameDays==1){
					runTotal++;
					break;
				}
				
			}
			trialLoop--;
			
		}
		System.out.println("The percentage of people sharing a birthday is " +((double)runTotal/(double)tRuns)*100+"%." );
	}
}
