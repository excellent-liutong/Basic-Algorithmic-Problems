import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        Solution solution = new Solution();
        // Create a test case
        //String testCase = [2,7,11,15];
        // Get the answer
        int[] nums={2,7,11,15};
        int target=9;
        int[] answer = solution.twoSum(nums, target);
        // Print the answer
        System.out.println(answer);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
         int complement =target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
                
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution!");    
        
    }
}

