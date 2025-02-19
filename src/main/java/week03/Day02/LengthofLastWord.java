package week03.Day02;

import org.testng.annotations.*;

public class LengthofLastWord {
	/*
	 positive- s = "Hello World"
	 negative-
	 edge- "Mandela"
	 pseducode:
	 1.Iterate through a for loop from reverse to the size of the string
	 2. declare a counter inside the if condition s[i]= " " and increment it.
	 3. return the value of the counter.
	 */

	@Test
	public void test1() {
		String s="Hello World";
		System.out.println(findLengthOfLastWord(s));
	}
	public int findLengthOfLastWord(String s) {
		int counter = 0;
		char space= ' ';
		for(int i=s.length()-1;i>0;i--) 
		{
	    //if(s.charAt(i) =! space) {
			if(s.charAt(i)== space) {
				break;
	    	
	    }
			counter++;
		}
		
		return counter;
	}
}
