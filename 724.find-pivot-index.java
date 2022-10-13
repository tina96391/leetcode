/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int index = -1;
        int sum = IntStream.of(nums).sum();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == (sum - left-nums[i])) {
                return i;
            }
            left += nums[i];
        }
        return index;
    }
}
// @lc code=end
