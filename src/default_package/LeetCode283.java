package default_package;

public class LeetCode283 {
	
	public void moveZeroes(int[] nums) {
		int n = nums.length;
		int n_zeroes = 0;
		int[] array = nums.clone();
		for (int i = 0; i < n; i++) {
			if (array[i] == 0) {
				n_zeroes += 1;
				nums[n - n_zeroes] = 0;
			} else {
				nums[i - n_zeroes] = array[i];
			}
		}
		
		for (int x : nums) {
			System.out.println(x);
		}
    }

	public static void main(String[] args) {
		LeetCode283 leetcode = new LeetCode283();
		int[] nums = {0,1,0,3,12};
		leetcode.moveZeroes(nums);
	}
}
