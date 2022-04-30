package StatsLibrary;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Functions 
{
	public double mean(ArrayList<Double> temp)		//mean method
	{
		double mean =0;
		
		for (int i = 0; i<temp.size();i++)
		{
			mean = mean + temp.get(i);
		}
		return mean/temp.size();
		
	}
	public double median(ArrayList<Double> temp)		//median method
	{
		double median = 0;
		Collections.sort(temp);
		
		if (temp.size() %2 ==0)
		{
			median = (temp.get(temp.size()/2)+temp.get((temp.size()/2) - 1))/2;
			
		}
		else
			median = temp.get(temp.size() / 2);
		return median;
		
	}
	public double mode (ArrayList<Double> temp)	//mode method
	{
		double mode = 0;
		int finalCount = 0;
		for(int i = 0; i< temp.size();i++)
		{
			int count = 0;
			for(int j = 0; j <temp.size(); j++)
			{
				if(temp.get(j) == temp.get(i))
				{
					count++;
				}
			}
				
			if(count>finalCount)
			{
				finalCount = count;
				mode = temp.get(i);
			}
			
		}
		return mode;
	}
	public double SD (ArrayList<Double> temp)	//standard deviation
	{
		double SD = 0;
		double sum = 0;
		int length = temp.size();
		double mean = 0;
		for(int i = 0;i<length;i++)
		{
			sum+=temp.get(i);
		}
		mean = sum/length;
		for(int j = 0;j<length;j++)
		{
			SD += Math.pow(temp.get(j) - mean,2);
		}
		return Math.sqrt(SD/length);
	}
	public double Variance (ArrayList<Double> temp)	//variance
	{
		double variance = 0;
		double sum = 0;
		int length = temp.size();
		double mean = 0;
		
		for(int i = 0;i<length;i++)
		{
			sum+=temp.get(i);
		}
		mean = sum/length;
		for(int j = 0;j<length;j++)
		{
			variance += Math.pow(temp.get(j) - mean,2);
		}
		return variance/length;
	}
	public BigInteger combination(double n, double r) //the correct combination formula
	{
		BigInteger combinationAns = new BigInteger("0");
		combinationAns = (factorial(n)).divide((factorial(r).multiply(factorial((n-r)))));
			//factorial(n-r));

		return combinationAns;
	}
    public int perms(int first)	//permutations
    {
        int tempPerm = 1;
        int finalPerm = 0;
        while(first>0)
        {
            
            tempPerm *=first;
            first--;
        }
        finalPerm=tempPerm;
      return finalPerm;
    }
    public void union (ArrayList<Double> temp1,ArrayList<Double> temp2)		//set union
	{
		ArrayList<Double> answer = new ArrayList<>();

		for(int i =0; i <temp1.size();i++)
			answer.add(temp1.get(i));
		for(int i =0; i <temp2.size();i++)
			answer.add(temp2.get(i));
		ArrayList<Double> finalAnswer = new ArrayList<>();
		for(Double num:answer)
			if(!finalAnswer.contains(num))
				finalAnswer.add(num);
			System.out.print("Union of the two sets are :"+ finalAnswer + " ");
			System.out.println();
	}
	public void intersection (ArrayList<Double> temp1,ArrayList<Double> temp2)	// set intersection
	{
		ArrayList<Double> set = new ArrayList<>();
		ArrayList<Double> subset = new ArrayList<>();
		for(int i =0; i <temp1.size();i++)
			set.add(temp1.get(i));
		for(int i =0; i <temp2.size();i++)
			subset.add(temp2.get(i));
		ArrayList<Double> finalAnswer = new ArrayList<>();
		for(Double num:set)
			if(subset.contains(num))
				finalAnswer.add(num);
		
		System.out.print("Intersection of the two sets are :"+ finalAnswer + " ");
		System.out.println();
		
	}
	public void compliment(ArrayList<Double> temp1,ArrayList<Double> temp2)	//set compliment
	{
		ArrayList<Double> set = new ArrayList<>();
		for(int i =0; i <temp1.size();i++)
			set.add(temp1.get(i));
		for(int i =0; i <temp2.size();i++)
			set.add(temp2.get(i));
		ArrayList<Double> finalAnswer = new ArrayList<>();
		for(int i =0; i <temp1.size();i++)
			finalAnswer.add(temp1.get(i));
		for(Double num:finalAnswer)
			if(set.contains(num))
				set.remove(num);
		System.out.println("Complement of set A is :"+ set + " ");
		
	}

	/**
	 * * This uses BigInteger to solve factorials.
	 * @param fact - This is the number you are trying to find the factorial of
	 * @return the factorial answer
	 */
	public BigInteger factorial(double fact)
	{
		BigInteger factorialAns = new BigInteger("1");
		for (int i = 1; i<=fact;i++)
		{
			factorialAns = factorialAns.multiply(BigInteger.valueOf(i));
		}
		return factorialAns;

	}
	
	/**
	 * This method can solve any binomial distribution problem.
	 * @param n - number of trials
	 * @param p - probability of success
	 * @param q - probability of failure
	 * @param y - probability of certain event occuring
	 * @return The probaility of something happening after a fixed amount of trials.
	 */ 
	public double binomialDistribution(double n,double p, double q, double y )
	{
		BigInteger combinations = combination(n, y);
		double comb = combinations.doubleValue();
		double pVal = Math.pow(p, y);
		double qVal = Math.pow(q, (n-y));
		double temp = qVal*pVal;
		return comb*temp;
	}
	public double binomialExpected(double p)
	{
		return 1.0/p;
	}
	public double binomialVariance(double p)
	{
		return (1-p)/(Math.pow(p, 2));
	}
	public double binomialSD(double p)
	{
		return Math.sqrt(binomialVariance(p));
	}
	/**
	 * This method solves any geometric distribution problem with 3 inputs.
	 * @param p - probability of success
	 * @param q - probability of failure
	 * @param y - the amount of tries
	 * @return The probability of something happening after a certain amount of fails.
	 */
	public double geometricDistribution(double p, double q, double y)
	{
		return Math.pow(q, (y-1))*p;
	}
	public double geoExpected(double r, double p)
	{
		return r/p;
	}
	public double geoVariance(double r, double p)
	{
		return (r*(1-p))/(Math.pow(p, 2));
	}
	public double geoStandDev(double r, double p)
	{
		return Math.sqrt(geoVariance(r, p));
	}
	/**
	 * This method solves any hypergeometric distribution with 4 inputs.
	 * @param N - the total set
	 * @param n - the amount that is being selected (subset)
	 * @param r - amount of success in that total set
	 * @param y - amounf of success in the subset
	 * @return The probability of success within that specific criteria.
	 */
	public double hypergeometricDistribution(double N, double n, double r, double y)
	{
		BigInteger part1 = combination(r, y);
		BigInteger part2 = combination((N-r), (n-y));
		BigInteger part3 = combination(N, n);
		BigInteger topHalf = (part1.multiply(part2));
		double temp = topHalf.doubleValue();
		double bottom = part3.doubleValue();
		return temp/bottom;
	}
	public double hypergeoExpected(double N, double n, double r)
	{
		return(n*r)/N;
	}
	public double hypergeoVariance(double N, double n, double r)
	{
		return n*(r/N)*((N-r)/N)*((N-n)/(N-1));
	}
	public double hypergeoStandDev(double N, double n, double r)
	{
		return Math.sqrt(hypergeoVariance(N, n, r));
	}
	/**
	 * This method solves any poisson distribution problem with 2 inputs.
	 * @param temp - the certain amount that is being asked
	 * @param lambda - the rate that is being given
	 * @return The probability of something occuring within a certain rate.
	 */
	public double poisson(double temp, double lambda)
	{
		BigInteger fact = (factorial(temp));
		return Math.pow(Math.E, (-lambda))*((Math.pow(lambda, temp))/fact.doubleValue());
	}
	public double poissonExpected(double lambda)
	{
		return lambda;
	}
	public double poissonVariance(double lambda)
	{
		return lambda;
	}
	public double poissonStandDev(double lambda)
	{
		return Math.sqrt(lambda);
	}
	/**
	 * This solves a problem using tchebyshev's theoreum with 4 inputs.
	 * @param SD - the standard deviation
	 * @param mean - the mean
	 * @param tUpper - the upper bound
	 * @param tLower - the lower bound
	 * @return The probability of something occurring within the upper and lower bounds.
	 */
	public double Tchebyshev(double SD, double mean, double tUpper, double tLower)
	{
		double k = 0.0;
		if((tUpper-mean) == (mean-tLower))
			k = (tUpper-mean)/SD;
		double finalAns = 1 -(1/(Math.pow(k, 2)));
		return finalAns;
	}
    public double uniformProbabilityDistribution(int largerVal, int smallerVal)
	{
		return 1/(double)(largerVal-smallerVal);
	}
	public double uniformExpected(double largerVal, double smallerVal)
	{
		return (largerVal+smallerVal)/2.0;
	}
	public double uniformVariance(double largerVal, double smallerVal)
	{
		return (largerVal-smallerVal)/12.0;
	}


	
	public void project3Results()
	{
		ArrayList<Double> dataset = new ArrayList<Double>();
		fillDataset(dataset);
		System.out.println(dataset.get(0));
		System.out.println(dataset.get(1));
		
	}
	public void fillDataset(ArrayList<Double> temp)
	{
		Collections.addAll(temp, 1498.0,1492.0,1467.0,1420.0,1413.0,1405.0,1400.0,1378.0,1361.0,1360.0,1350.0,1347.0,1347.0,1340.0,1320.0,1316.0,1311.0,1302.0,1282.0,1278.0,1272.0,1269.0,1268.0,1266.0,1266.0,1266.0,1258.0,1256.0,1248.0,1244.0,1239.0,1237.0,1235.0,1235.0,1231.0,1230.0,1226.0,1225.0,1225.0,1223.0,1222.0,1221.0,1219.0,1219.0,1217.0,1217.0,1216.0,1214.0);

	}
}
