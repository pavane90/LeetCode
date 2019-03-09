package easy;

import java.util.HashMap;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 3, 7, 6, 11};
		int target = 9;

		int[] result = twoSum(nums, target);

		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
	    if(nums==null || nums.length<2)
	        return new int[]{0,0};

	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            return new int[]{map.get(nums[i]), i};
	        }else{
	            map.put(target-nums[i], i);
	        }
	    }

	    return new int[]{0,0};
	}
}
