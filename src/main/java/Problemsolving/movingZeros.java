package Problemsolving;

import org.junit.Test;

public class movingZeros {
	/*
1. positive [0,1,0,2,3]
2. Neg [0]
3. Edge[1,2,3,0,0]
4. Psudocode:
use a integer variable temp
iterate through the array i= 0 and if array element ==0 
  --> iterate into a nested for loop start with next index j= i+1 
    --> Condition if j element in the array != 0
        --> save temp with array{i};
                 array[i] = array[j];
                 array[j] = temp;
                 
 */
	@Test
	public void testdata1()
	{
		//int [] arr = 
	}

}
