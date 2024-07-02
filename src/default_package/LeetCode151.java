package default_package;

public class LeetCode151 {
	
    public String reverseWords(String s) {
    	StringBuilder solution = new StringBuilder();
    	String[] words = s.split("\\s+");
    	int n = words.length;
    	for (int i = 0; i < n; i++) {
    		String word = words[n - i - 1];
    		solution.append(word.trim() + " ");
    	}
        return solution.toString().trim();
    }

	public static void main(String[] args) {
		LeetCode151 leetcode = new LeetCode151();
		String solution = leetcode.reverseWords("oi tudo bem");
		System.out.println(solution);
	}

}
