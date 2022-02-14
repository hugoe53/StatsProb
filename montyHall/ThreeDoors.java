package montyHall;
//runs 10,000 times and not change door
//play 10,000 times and change door every time
//no scanner, let game do everything, trials = 100000
//no more than 4 lines in main
import java.util.Random;
public class ThreeDoors 
{
	
	public void keepDoor()
	{
		System.out.println("This is using the situation where you don't change doors.");
		int wins = 0;
		int losses = 0;
		Random rand = new Random();
		for(int i = 0;i < 10000;i++ )
		{
			int[] doors= {0,0,0};
			int choice = rand.nextInt(3);
			doors[rand.nextInt(3)]=1;
			int shown = rand.nextInt(3);
			if(doors[choice]==1)
				wins++;
			else if (doors[choice]==shown)
				losses++;
			else
				losses++;
			
		}
		System.out.println("There were "+wins+" wins.");
		System.out.println("The percent for winning is "+wins/100+"%.");
		System.out.println("There were " +losses+ " losses.");
		System.out.println("The percent for losing is " +losses/100+ "%.");
		System.out.println();		
		
		
	}
	public void changeDoor()
	{
		System.out.println("This is using the situation where you change doors.");
		int wins = 0;
		int losses = 0;
		int changedGuess = 0;
		Random rand = new Random();
		for(int i = 0;i < 10000;i++ )
		{
			int[] doors= {0,0,0};
			int choice = rand.nextInt(3);
			doors[rand.nextInt(3)]=1;
			int shown = rand.nextInt(3);
			if(doors[choice]==1)
				wins++;
			else
			{
				for(int j =0;j<3;j++)
				{
					if(j != shown&&j!=choice)
						changedGuess =j;
				}
				if(doors[changedGuess]==1)
					wins++;
				else
					losses++;
			}
			
				
		}
		System.out.println("There were "+wins+" wins.");
		System.out.println("The percent for winning is "+wins/100+"%.");
		System.out.println("There were " +losses+ " losses.");
		System.out.println("The percent for losing is " +losses/100+ "%.");
		System.out.println();
	}
}
