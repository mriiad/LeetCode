class Solution {
    public int romanToInt(String s) {
	HashMap<Character, Integer> map = new HashMap<>();
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
	int sum = 0;
	for(int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    sum += map.get(c);
	    if(c == 'V' || c == 'X') {
		if(i > 0 && s.charAt(i - 1) == 'I') {
		    sum-=2;
		}
	    }
	    if(c == 'L' || c == 'C') {
		if(i > 0 && s.charAt(i - 1) == 'X') {
		    sum-=map.get('X') * 2;
		}
	    }
	    if(c == 'D' || c == 'M') {
		if(i > 0 && s.charAt(i - 1) == 'C') {
		    sum-=map.get('C') * 2;
		}
	    }
	}
	return sum;
    }
}
