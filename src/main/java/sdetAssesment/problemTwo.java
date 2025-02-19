package sdetAssesment;

import java.util.ArrayList;

import org.junit.Test;

public class problemTwo {
	/*
Data Set
 Positive- Input: strs = ["flower","flow","flight"]
 Negative- Input: strs = ["dog","racecar","car"] 
 Edge-
code:
1. String of Array strs
2. Find the number of elements in the string array
3. Assign each element of the array to a  
Compare the strs[0] characters with all the string in array 
3. 
*/
@Test
public void test1() {
	String[] strs = {"flower","flow","flight"};
	System.out.println(longestCommenPrefix(strs));
}

	private String longestCommenPrefix(String[] strs) {
		// TODO Auto-generated method stub
		if (strs == null || strs.length==0)
		{
			return "";
		}
		//ArrayList<Character> Prefix = new ArrayList<Character>();
		String prefix = strs[0];
		//for(int i=0;i<firstElement.length();i++) {
			for(int i=1; i<strs.length-1;i++) {
				while(strs[i].indexOf(prefix)!=0) {
					prefix= prefix.substring(0, prefix.length()-1);
				}
				if(prefix.isEmpty()) {
					return"";
				}
				/*if(firstElement.charAt(i)==strs[j].charAt(i)&& firstElement.charAt(i+1)== ) {
					//strs[i].getChars(i, j, Prefix, i);
					//Prefix = strs[0].substring(i, i+1);
					Prefix.add(firstElement.charAt(i));
				*/	//return Prefix;
				}
					
	          		
		//}
		return prefix;
	}

}
