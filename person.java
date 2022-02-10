package bdayProb;

import java.util.Random;


public class person 
{
	final Random rand = new Random();
	private int birthday;
	public person()
	{
		birthday = rand.nextInt(365)+1;
	}
	public int getBday()
	{
		return birthday;
	}
	
	
}
