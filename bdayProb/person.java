package bdayProb;


import java.util.Random;


public class Person 
{
	final Random rand = new Random();
	private int birthday;
	public Person()
	{
		birthday = rand.nextInt(365)+1;
	}
	public int getBday()
	{
		return birthday;
	}
	
	
}
