package week01.Day01;

import java.util.ArrayList;
import java.util.List;

public class practice 
{
	public static void main(String[] args) 
	{
		int[] input = {1, 1, 1};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) 
		{ //i=1 --> 2
			for (int j = i+1; j < input.length; j++) 
			{ //j=2 --> 2
				if (input[i] == input[j]) 
				{
					if(!list.contains(input[i])) 
					{
						System.out.println(input[i]);
						list.add(input[i]); //list - [2]
					}
				}
			}
		}
	}
	
}
