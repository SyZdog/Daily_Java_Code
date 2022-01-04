package cn.tedu.method;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = ChangeNums();
		System.out.println(a);
	}
	public static int ChangeNums() {
		
		int[] nums = {3,2,1,2,1,7};
		int[] nums2 = new int[nums.length];
		int count = 0;
		Arrays.sort(nums);
		//Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length-1; i++){
			
			//map.put(nums[i], i);
			int newNums =  nums[i]+1;
			for (int j = 0; j < nums.length-1; j++) {
				if(newNums != nums[j]) {
					count++;
				}else {
					newNums++;
				}
			}
		}
		return count;
		
	}
}
