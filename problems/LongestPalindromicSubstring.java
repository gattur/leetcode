package problems;

public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		
		int l = s.length();
		int st = 0;
		int lx = 0;
		
		boolean dp[][] = new boolean[l][l];
		for (int i = 0; i < l; i++) {
			dp[i][i] = true;
			lx=1;
		}
		for (int i = 0; i < l - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				dp[i][i + 1] = true;
				lx = 2;
				st = i;
			}
		}
		for (int i = 3; i <= dp.length; i++) {
			for (int j = 0; j <= dp.length - i; j++) {
				int k = i + j - 1;
				if (dp[j + 1][k - 1] && s.charAt(j) == s.charAt(k)) {
					dp[j][k] = true;
					if (i > lx) {
						lx = i;
						st = j;
					}

				}

			}
		}
		System.out.println(lx);
		return s.substring(st, st + lx); 
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome(""));
	}

	
}
