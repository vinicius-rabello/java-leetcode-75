package default_package;

public class LeetCode334 {
	
	public boolean increasingTriplet(int[] nums) {
		int min = nums[0];
		int mid = 1000000000;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
				System.out.println("min: " + min);
			}
			else if (nums[i] > min && nums[i] < mid) {
				mid = nums[i];
				System.out.println("mid: " + mid);
			}
			else if (nums[i] > mid && mid > min) {
				return true;
			}
		}
		return false;
    }

	public static void main(String[] args) {
		LeetCode334 leetcode = new LeetCode334();
		int[] nums = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10000};
		boolean solution = leetcode.increasingTriplet(nums);
		System.out.println(solution);
	}

}
