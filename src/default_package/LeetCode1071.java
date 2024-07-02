package default_package;

public class LeetCode1071 {
	
	public String gcdOfStrings(String str1, String str2) {
	    String solution = "";
	    String candidate;
		
		if (str1.length() > str2.length()) {
			String str3 = str1;
			str1 = str2;
			str2 = str3;
		}
		
		for (int i = 1; i <= str1.length(); i++) {
			candidate = str1.substring(0, i);
			int len1 = str1.length();
			int len2 = str2.length();
			int len_cand = candidate.length();

			if (len1 % len_cand == 0 && len2 % len_cand == 0) {
				int n1 = len1/len_cand;
				int n2 = len2/len_cand;
				
				if (candidate.repeat(n1).equals(str1) && candidate.repeat(n2).equals(str2)) {
					solution = candidate;
				}
			}
		}
		return solution;
	}
	
	public static void main(String[] args) {
        LeetCode1071 solution = new LeetCode1071();
        String gcd = solution.gcdOfStrings("TAUXXTAUXXTAUXX", "TAUXX");
        System.out.println(gcd);
    }
}