package Week02.Day02;

import org.testng.annotations.*;

public class stringShufleArray {
	/*
	 * 
	 */
	@Test
	public void test1() {
		String code = "leetcode";
		Integer[] ind = {4,5,6,7,0,2,1,3};
	    System.out.println(restoreString(code,ind));
	}
	@Test
	public void test2() {
		String code = "abc";
		Integer[] ind = {0,1,2};
	    System.out.println(restoreString(code,ind));	
	}
	@Test
	public void test3() {
		String code = "";
		Integer[] ind = {};
	    System.out.println(restoreString(code,ind));	
	}
	
	public char[] restoreString(String s, Integer[] ind) {
	        char character[]=new char[ind.length];
	        for(int i=0;i<ind.length;i++){
	            character[ind[i]]=s.charAt(i);
	        }
	        return  character;
	    }

}
