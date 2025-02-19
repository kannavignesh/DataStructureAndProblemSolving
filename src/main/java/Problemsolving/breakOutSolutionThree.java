package Problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class breakOutSolutionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Remove the target element in the array
		example 1: input = [2, 3, 3, 4, 5], target=3
		          output = [2, 4, 5]
		          explanation: when 3 is removed from input array, 
		                        output is [2, 4, 5]

		example 2: input = [2, 2], target=2
		          output = []
		          explanation: when 2 is removed, output would be empty array?
		          
Positive case{1,2,3,4,5,6,7,8,9} target 1
Negative Case{1,2,3} target 4
EdgeCase{} target 1	          
PsudoCode:
1.Store the target int as removeValue , create an array test
2.Create an ArrayList arrayInput
3.Sort the arrayInput
4.arrayInput.remove(removeValue)
.  	          
*/
 int removeValue = 1;
 int[] test = {1,2,3,4,5,6,7,8,9};
 
 List<Integer> list = new ArrayList<Integer>(test.length);
 for (int i : test)
 {
     list.add(i);
 }
 //list.removeAll();
 
 System.out.print(list);
 
 
  //new ArrayList<Integer>(Arrays.asList(test));
	}

}
