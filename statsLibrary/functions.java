package statsLibrary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class functions 
{
	public double mean(double[] temp)		//mean method
	{
		double mean =0;
		
		for (int i = 0; i<temp.length;i++)
		{
			mean = mean + temp[i];
		}
		return mean/temp.length;
		
	}
	public double median(double[] temp)		//median method
	{
		double median = 0;
		Arrays.sort(temp);
		
		if (temp.length %2 ==0)
		{
			median = (temp[temp.length/2]+temp[(temp.length/2) - 1])/2;
			
		}
		else
			median = temp[temp.length / 2];
		return median;
		
	}
	public double mode (double[] temp)	//mode method
	{
		double mode = 0;
		int finalCount = 0;
		for(int i = 0; i< temp.length;i++)
		{
			int count = 0;
			for(int j = 0; j <temp.length; j++)
			{
				if(temp[j] == temp[i])
				{
					count++;
				}
			}
				
			if(count>finalCount)
			{
				finalCount = count;
				mode = temp[i];
			}
			
		}
		return mode;
	}
	public double SD (double[] temp)	//standard deviation
	{
		double SD = 0;
		double sum = 0;
		int length = temp.length;
		double mean = 0;
		for(int i = 0;i<length;i++)
		{
			sum+=temp[i];
		}
		mean = sum/length;
		for(int j = 0;j<length;j++)
		{
			SD += Math.pow(temp[j] - mean,2);
		}
		return Math.sqrt(SD/length);
	}
	public double Variance (double[] temp)	//variance
	{
		double variance = 0;
		double sum = 0;
		int length = temp.length;
		double mean = 0;
		
		for(int i = 0;i<length;i++)
		{
			sum+=temp[i];
		}
		mean = sum/length;
		for(int j = 0;j<length;j++)
		{
			variance += Math.pow(temp[j] - mean,2);
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
	//public double factorial(int fact)
	{
	//	if()
	}
	/**
	 * *This uses BigInteger to solve factorials.
	 * @param fact
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
	public double binomialDistribution(double n,double p, double q, double y )
	{
		BigInteger combinations = combination(n, y);
		double comb = combinations.doubleValue();
		double pVal = Math.pow(p, y);
		double qVal = Math.pow(q, (n-y));
		double temp = qVal*pVal;
		return comb*temp;
	}
	public double geometricDistribution(double p, double q, double y)
	{
		return Math.pow(q, (y-1))*p;
	}
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
	public void results(double[] tempArray,ArrayList<Double> test1,ArrayList<Double> test2)		//a method that prints all results
	{
		System.out.println("The mean is :"+mean(tempArray)+". The median is :"+median(tempArray)+". The mode is : "+mode(tempArray)+".");
		System.out.println();
		System.out.println("The standard deviation is :"+SD(tempArray));
		System.out.println();
		System.out.println("The variance is :"+Variance(tempArray));
		System.out.println();
		
		union(test1,test2);
		System.out.println();
		intersection(test1, test2);
		System.out.println();
		compliment(test1, test2);
		System.out.println();
           // This is 2.52 in the book
		System.out.println();
        System.out.println("The permutation is : "+perms(3));    // This is 2.36 in the book
        System.out.println("The permutation is : "+perms(6));    // This is 2.37a in the book
	}
}
