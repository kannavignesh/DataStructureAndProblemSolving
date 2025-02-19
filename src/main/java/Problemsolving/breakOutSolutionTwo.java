package Problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class breakOutSolutionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] a = { 0, 1, 1, 1, 0 };
			List<Integer> number = new ArrayList<>();
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 1) {
					number.add(a[i]);
				}
			}
			System.out.println(number.size());
		}

	}


