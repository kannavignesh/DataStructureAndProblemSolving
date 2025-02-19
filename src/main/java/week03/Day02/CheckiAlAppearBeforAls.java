package week03.Day02;

import org.testng.annotations.*;

public class CheckiAlAppearBeforAls {
	/*
	 positive- s = "aaabbb"
	 negative- s = "abab"
	 edge- s="bbb"
	 psudocode:
	 1. Iterate through the string from the begeni
     2. check if s[i]==b&& s[i+1]==a return false     
	 */
	
	@Test
	public void test1() {
		String s="aaabbb";
	System.out.println(	checkIfaafterb(s));
	}
	@Test
	public void test2() {
		String s="abab";
	System.out.println(	checkIfaafterb(s));
	}
	@Test
	public void test3() {
		String s="bbb";
	System.out.println(	checkIfaafterb(s));
	}

	public boolean checkIfaafterb(String s) {
		char b='b';
		char a='a';
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)== b && s.charAt(i+1)== a )
				return false;
		}
		
		return true;
	}
}
