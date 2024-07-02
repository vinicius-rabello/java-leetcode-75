package default_package;
import java.util.ArrayList;

public class LeetCode1431 {
	public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		ArrayList<Boolean> solution = new ArrayList<Boolean>();
		int max_candies = 0;
		for (int kid : candies) {
			if (kid >= max_candies) {
				max_candies = kid;
			}
		}
		for (int kid : candies) {
			if (kid + extraCandies >= max_candies) {
				solution.add(true);
			} else {
				solution.add(false);
			}
		}
		return solution;
	}
	
	public static void main(String[] args) {
		LeetCode1431 leetcode = new LeetCode1431();
		int extraCandies = 5;
		int[] candies = {1,2,3,7,0,9,2,2,2,2};
        ArrayList<Boolean> solution = leetcode.kidsWithCandies(candies, extraCandies);
	}
}
