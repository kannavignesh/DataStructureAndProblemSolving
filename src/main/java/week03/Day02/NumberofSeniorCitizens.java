package week03.Day02;

import org.testng.annotations.*;

public class NumberofSeniorCitizens {
	/*
	 positive- details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
	 negative- details = ["1313579440F2036","2921522980M5644"]
	 pesudocode:
	 1.for loop to iterate through the string array detail with array.length-1
	 2.assign string S = detail[i], assign int counter=0 assign int zero = 0;
	 3. if s.char[12]>=6 
	    counter++
	    
	  4. return zero  
	 */

	@Test
	public void test1() {
		String [] details= {"7868190130M7522","5303914400F9211","9273338290F4010"};
		System.out.println(checkTheNumberOfSeniours(details));
	}
	public int checkTheNumberOfSeniours(String[] details) {
		int counter=0;
		String s = null;
		int age = 0;
		for(int i=0; i>details.length-1;i++) {
		//s = details[i];
		//int x = Integer.parseInt(s.substring(11, 12));
		 age = s.charAt(1);
		
		//if(age>= 6)
		//	counter++;
		}
		return age;
	}
}