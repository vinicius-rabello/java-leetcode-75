package default_package;
import java.util.ArrayList;

public class LeetCode605 {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		ArrayList<Integer> flowers = new ArrayList<Integer>();
		int planted_seeds = 0;
		for (int flower : flowerbed) {
			flowers.add(flower);
		}
		
		if (flowerbed.length == 1) { /* check case that flowerbed is of length 1 */
			if (flowers.get(0) == 0) {
				flowers.set(0, 1);
				planted_seeds += 1;
			}
		} else {
			for (int i = 0; i < flowerbed.length; i++) {
				if (i == 0) { /* check if its the first stop */
					if (flowers.get(i) == 0 && flowers.get(i+1) == 0) {
						flowers.set(i, 1);
						planted_seeds += 1;
					}
				} else if (i == flowerbed.length - 1) {
					if (flowers.get(i) == 0 && flowers.get(i-1) == 0) {
						flowers.set(i, 1);
						planted_seeds += 1;
					}
				} else {
					if (flowers.get(i) == 0 && flowers.get(i-1) == 0 && flowers.get(i+1) == 0) {
						flowers.set(i, 1);
						planted_seeds += 1;
					}
				}
			}
		}
		System.out.println(flowers.toString());
		if (planted_seeds >= n) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		LeetCode605 leetcode = new LeetCode605();
		int[] flowerbed = {0};
		int n = 1;
        boolean solution = leetcode.canPlaceFlowers(flowerbed, n);
        System.out.println(solution);
	}
}
