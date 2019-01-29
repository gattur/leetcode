package problems;

import java.util.*;

public class TripletSum {

	 static public List<List<Integer>> threeSum(int[] nums) {
	     List<List<Integer>> ans=new ArrayList<>();   
		 Set<String> s=new TreeSet<>();
	     int j=0;
		 int k=0;
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length-2; i++) {
			j=i+1;
			k=nums.length-1;
			while(i<k &&j<k) {
				if(nums[i]+nums[j]+nums[k]==0) {
					
					//String a=nums[i]+","+nums[j]+","+nums[k];
					if(!s.contains(nums[i]+","+nums[j]+","+nums[k])) {
						List<Integer> temp=new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
						ans.add(temp);
						s.add(nums[i]+","+nums[j]+","+nums[k]);
					}
					j=j+1;
					k=k-1;
				}
				else if(nums[i]+nums[j]+nums[k]<0) {
					j=j+1;
				}
				else {
					k=k-1;
				}
			}
		}
		 
		 return ans;
	  }
	 public static void main(String[] args) {
		int n[]= {-2,0,1,1,2};
		List<List<Integer>> ans=threeSum(n);
		for (List<Integer> list : ans) {
			System.out.println(list);
		}
		
	}
}
