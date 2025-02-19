package Week02.Day02;

import org.testng.annotations.*;

public class stringCompareVovelsInHalf {
	/*
	 positive- book
	 negative- textbook
	 edge- ""
	 Pesudocode
	 1.divide the given string by 
	 string s
	 int s1 = s.length/2
	 int a
	 int b
	 2.compare first half of string has vovels and count
	 for(i=0;i<=s1;i++){
	 if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' )
	 a++
	 }
	 3.compare second half string has vovels and count
	 for(i=s1,i<s.length,i++){
	 if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' )
	 b++
	 }
	 4. compare both number of vovels in a and b are equal and return value
	 return a==b
	 */
@Test
public void test1() {
	String Word= "Text";
	boolean comparedOutcome = compareVovelsSubString(Word); 
	System.out.println(comparedOutcome); 
}

public Boolean compareVovelsSubString(String s) {
	int a=0;
	int b=0;
	int n = s.length();	
	for(int i = 0;i<=n;i++){
		 if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' )
		 a++;
		 }
	for(int i=n/2; i<n;i++) {
		if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' )
			 b++;
	}
	if (a==b) {
		return true;
	}
	return false;
}
}
