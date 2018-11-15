package problems;

import java.util.Map;
import java.util.TreeMap;

public class TwoSum {

	static int[] twoSum(int[] nums, int target) {
		int a[] = new int[2];
		Map<Integer, Integer> mp = new TreeMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (mp.containsKey(target - nums[i])) {
				a[0] = mp.get(target - (nums[i]));
				a[1] = i;
				return a;
			}
			mp.put(nums[i], i);
		}
		return a;

	}

	public static void main(String[] args) {

		int nums[] = { 2, 7, 11, 15 };
		int arr[] = twoSum(nums, 9);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
