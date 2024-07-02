package default_package;

public class Main {
	static public void main(String[] args) {
		String word1 = "leonardo";
		String word2 = "leo";
		StringBuilder word = new StringBuilder();
		
		int min_len = Math.min(word1.length(), word2.length());
		for (int i = 0; i < min_len; i++) {
			word.append(word1.charAt(i));
			word.append(word2.charAt(i));
		}
		word.append(word1.substring(min_len));
		word.append(word2.substring(min_len));
		
		System.out.println(word);
	}
}