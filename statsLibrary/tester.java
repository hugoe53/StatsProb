package statsLibrary;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class tester {

	public static void main(String[] args) 
	{
		functions test1 = new functions();
		double[] values = {1,3,4,2,5,6,3};
		ArrayList<Double> value1 = new ArrayList<Double>(Arrays.asList(4.0,3.0,6.0));
		ArrayList<Double> value2 = new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0));
		//test1.results(values,value1,value2);//prints the results here
		//System.out.println(test1.binomialDistribution(5,.75,.25,3));
        //System.out.println(test1.geometricDistribution(.99,.01,2))	;
        System.out.println(test1.hypergeometricDistribution(196,10,101,7));
        	

	}

}
