package week01.Day01;
import java.util.HashSet;

//import org.junit.Test;
//import org.junit.validator.PublicClassValidator;

public class Solution {
	public boolean containsDuplicate(int[] nums) {        
        HashSet<Integer> set = new HashSet<>();               
        for (int num : nums) {   
            if (set.contains(num)) {
                return true;
            }    
            set.add(num);
        }       
        return false;
    }
	
    public static void main(String[] args) {
        Solution solution = new Solution();       
        // Example 1
       
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1));
        
        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2));        
        // Example 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3)); 
    }
}


