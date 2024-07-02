package default_package;

import java.util.ArrayList;

public class LeetCode238 {
	
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] solution = new int[n];
		
		solution[0] = 1;
		// left prefix code
		for (int i = 1; i < n; i++) {
			solution[i] = solution[i-1] * nums[i-1];
		}
		
		// rest of solution
		int product = 1;
		for (int j = n-1; j >= 0; j--) {
			solution[j] = solution[j] * product;
			product *= nums[j];
		}
		return solution;
    }

	public static void main(String[] args) {
		LeetCode238 leetcode = new LeetCode238();
		int[] nums = {1,2,3,4};
		int[] solution = leetcode.productExceptSelf(nums);
		for (int x : solution) {
			System.out.println(x);
		}
	}
}
