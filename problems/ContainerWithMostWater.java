package problems;

public class ContainerWithMostWater {

	static public int maxArea(int[] height) {

		int l = 0;
		int r = height.length - 1;
		int maxima = 0;
		int minima = 0;
		while (l < r && l < height.length && r >= 0) {
			if (height[l] < height[r]) {
				minima = height[l];
				maxima = maxima < (minima * (r - l)) ? minima * (r - l) : maxima;
				l = l + 1;
			} else {
				minima = height[r];
				maxima = maxima < (minima * (r - l)) ? minima * (r - l) : maxima;
				r = r - 1;
			}

		}

		return maxima;

	}

	public static void main(String[] args) {
		int[] inp = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(inp));
	}
}
