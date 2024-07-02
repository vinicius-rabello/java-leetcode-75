package default_package;

import java.util.ArrayList;

public class LeetCode345 {
	
	public String reverseVowels(String s) {
		StringBuilder string = new StringBuilder(s);
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		ArrayList<Character> vowels_list = new ArrayList<Character>();
		ArrayList<Integer> vowels_idx = new ArrayList<Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			for (char v : vowels) {
				if (currentChar == v) {
					vowels_list.add(currentChar);
					vowels_idx.add(i);
					break;
				}
			}
		}
		
		for (int j = 0; j < vowels_list.size(); j++) {
			System.out.println(j);
			string.setCharAt(vowels_idx.get(j), vowels_list.get(vowels_list.size() - j - 1));
		}
		
		System.out.println(vowels_list.toString());
		System.out.println(vowels_idx.toString());
        return string.toString();
    }

	public static void main(String[] args) {
		LeetCode345 leetcode = new LeetCode345();
		String s = "Vinicius Rabello Rodrigues";
		String solution = leetcode.reverseVowels(s);
		System.out.println(solution);
	}

}
