package default_package;

public class LeetCode443 extends LeetCode334 {
	
	public char[] IntegerToCharArray(int num) {
		String string = Integer.toString(num);
		int n = string.length();
		char[] CharArray = new char[n];
		for (int i = 0; i < n; i++) {
			CharArray[i] = string.charAt(i);
		}
		return CharArray;
	}
	
    public int compress(char[] chars) {
    	if (chars.length == 1) {
    		return 1;
    	}
    	
    	StringBuilder s = new StringBuilder();
    	int count = 0;
    	char currentChar = chars[0];
    	int idx = 0;
    	char[] charsCopy = chars.clone();
    	for (char x : charsCopy) {
    		if (x == currentChar) {
    			count += 1;
    		} else {
    			if (count == 1) {
    				s.append(currentChar);
    				chars[idx] = currentChar;
    				idx += 1;
    			} else {
    				s.append(currentChar);
    				s.append(count);
    				char[] countArray = IntegerToCharArray(count);
    				chars[idx] = currentChar;
    				idx += 1;
    				for (int i = 0; i < countArray.length; i++) {
    					chars[idx] = countArray[i];
    					idx += 1;
    				}
    			}
    			currentChar = x;
    			count = 1;
    		}
    	}	
    	if (count == 1) {
			System.out.println("ok");
			s.append(currentChar);
			chars[idx] = currentChar;
			idx += 1;
    	} else {
	    	char[] countArray = IntegerToCharArray(count);
	    	chars[idx] = currentChar;
	    	idx += 1;
			for (int i = 0; i < countArray.length; i++) {
				chars[idx] = countArray[i];
				idx += 1;
			}
	    	s.append(currentChar);
			s.append(count);
    	}
		
		int len = s.length();
		System.out.println(chars);
        return len;
    }

	public static void main(String[] args) {
		LeetCode443 leetcode = new LeetCode443();
		char[] chars = {'a','b','c'};
		int solution = leetcode.compress(chars);
		System.out.println(solution);
	}
}