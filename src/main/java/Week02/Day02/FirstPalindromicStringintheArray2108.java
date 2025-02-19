package Week02.Day02;
import org.testng.annotations.*;


public class FirstPalindromicStringintheArray2108 {
/*
 * positive-words = ["abc","car","ada","racecar","cool"]
 * negative- words = ["def","ghi"]
 * 
 1.for loop to traverse through the array of string
 2.check with if condition palindrome by checking the first char and the last char and iterate 
 3. return
 
 */
	@Test
	public void test1() {
		String[] words= {"abc","car","ada","racecar","cool"};
		System.out.println( firstPalindrome(words));
	}
	@Test
	public void test2() {
		String[] words= {"def","ghi"};
		System.out.println( firstPalindrome(words));
	}
	 public String firstPalindrome(String[] words) {
		 
		for(int a=0;a<words.length;a++) {
			  if(checkIfPalindrome(words[a])) {
				  return words[a];
			  }
		}		 
	        return "No palindrome found";
	 }

	public boolean checkIfPalindrome(String string) {
		
		int	i=0, j=string.length()-1;
		while(i<j) {
			if(string.charAt(i)!= string.charAt(j)) 
				return false;
				i++;
				j--;
			}			
		return true;
		
	}
		
 }


