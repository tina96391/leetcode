/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {

        int[] output = new int[nums.length];


        for (int i =0;i<nums.length;i++){
            if (i==0){
                output[i]=nums[i];
            }
            else{
                output[i]=output[i-1] + nums[i];
            }
        }

        return output;
    }
}
// @lc code=end

