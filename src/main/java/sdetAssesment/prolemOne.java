package sdetAssesment;

import java.util.ArrayList;
import java.util.Arrays;


import org.testng.annotations.Test;

public class prolemOne {

	@org.testng.annotations.Test
	public void test1() {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		//System.out.println(nums.length);
		System.out.println(positionOfTarget(nums,target));
	}
	@Test
	public void test2() {
		int[] nums = {5,7,7,8,8,10};
		int target = 6;
		System.out.println(positionOfTarget(nums,target));
	}
	@Test
	public void test3() {
		int[] nums = {5,6,7,7,8,8,10};
		int target = 6;
		System.out.println(positionOfTarget(nums,target));
	}

	public ArrayList<Integer> positionOfTarget(int[]nums,int target) {
		int negative = -1;
		ArrayList<Integer> position= new ArrayList<Integer>() ;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] == target && nums[i+1] == target ) {
				position.add(i);
				position.add(i+1);
					return position;
			}
			
		}
		for(int j=0;j<nums.length-1;j++) {
			if(nums[j] == target) {
				position.add(j);
				position.add(j);
				return position;
			}
		}
		
		position.add(negative);
		position.add(negative);
		return position; 
	}
}