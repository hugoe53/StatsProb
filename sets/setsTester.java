package sets;

import java.util.ArrayList;
import java.util.Arrays;

public class setsTester {

	public static void main(String[] args) 
	{
		ArrayList<Double> value1 = new ArrayList<Double>(Arrays.asList(4.0,3.0,6.0));
		ArrayList<Double> value2 = new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0));
		setsFunctions test = new setsFunctions();
		test.union(value1, value2);
		test.intersection(value1, value2);
		test.compliment(value1, value2);
		
	}

}
