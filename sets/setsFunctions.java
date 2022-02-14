package sets;

import java.util.ArrayList;
import java.util.Arrays;

public class setsFunctions 
{
	public void union (ArrayList<Double> temp1,ArrayList<Double> temp2)
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
	public void intersection (ArrayList<Double> temp1,ArrayList<Double> temp2)
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
	public void compliment(ArrayList<Double> temp1,ArrayList<Double> temp2)
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
}
