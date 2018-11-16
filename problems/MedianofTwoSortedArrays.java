package problems;

public class MedianofTwoSortedArrays {

	static double fin(int[] input1, int[] input2) {

		if (input1.length > input2.length)
			return fin(input2, input1);

		int x = input1.length;
		int y = input2.length;

		int low = 0;
		int high = x;
		while (low <= high) {
			int mid = (int) (((low + high) / 2));
			int othrt = (x + y + 1) / 2 - mid;
			int left1 = (mid == 0) ? Integer.MIN_VALUE : input1[mid - 1];
			int right1 = (mid == x) ? Integer.MAX_VALUE : input1[mid];

			int left2 = (othrt == 0) ? Integer.MIN_VALUE : input2[othrt - 1];
			int right2 = (othrt == y) ? Integer.MAX_VALUE : input2[othrt];

			if (left1 <= right2 && left2 <= right1) {

				if ((x + y) % 2 == 0) {
					return (double) (Math.min(right1, right2) + Math.max(left1, left2)) / 2;
				}
				return (double) Math.max(left1, left2);
			} else if (left1 > right2) {
				high = high - 1;
			} else
				low = low + 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		int[] input1 = { 1, 2 };
		int[] input2 = { 3, 4 };
		System.out.println((double) fin(input1, input2));

	}
}
