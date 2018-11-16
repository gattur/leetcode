package problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		Set<Character> set = new HashSet<>();

		int i = 0;
		int j = 0;
		int ans = 0;

		while (i < s.length() && j < s.length()) {
			if (!set.contains(s.charAt(i))) {
				// System.out.println(index);
				set.add(s.charAt(i));
				// i=index;
				i = i + 1;
				ans = Math.max(ans, i - j);
				// System.out.println(ans);
			} else {
				set.remove(s.charAt(j));
				j = j + 1;
				// System.out.println(index+" "+j);
			}
		}
		System.out.println(ans);
	}
}
