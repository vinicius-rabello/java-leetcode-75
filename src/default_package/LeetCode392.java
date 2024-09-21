package default_package;

public class LeetCode392 {
	
    public boolean isSubsequence(String s, String t) {
    	int n = s.length();
    	int m = t.length();
    	int startingPoint = 0;
    	String currSubstring = t;
    	for (int i = 0; i < n; i++) {
    		currSubstring = currSubstring.substring(startingPoint);
    		int foundIndex = currSubstring.indexOf(s.charAt(i));
    		if (foundIndex != -1) {
    			startingPoint = foundIndex + 1;
    			continue;
    		} else {
    			return false;
    		}
    	}
    	return true;
    }

	public static void main(String[] args) {
		LeetCode392 leetcode = new LeetCode392();
		String s =  "abc";
		String t = "cahbggc";
		boolean solution = leetcode.isSubsequence(s, t);
		System.out.println(solution);
	}
}
