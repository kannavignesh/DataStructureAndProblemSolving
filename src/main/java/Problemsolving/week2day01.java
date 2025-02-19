package Problemsolving;

public class week2day01 {
	
	//checked for the first occurence of the ones and minus the total length 
	
	public static void main(String[] args) {
      int[] testArray1= {0,0,0,1,1,1};
      int countOfOne = countOneInArray(testArray1);
	System.out.print(countOfOne);
	
	}
	
	public static int countOneInArray(int[] array) {
		int count=0;
		for(int num : array) {
			if(num ==1)
			{
				count++;
			}
		}
		return count;
		
	}
}
