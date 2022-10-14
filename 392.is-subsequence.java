/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {

		if (s.length() > t.length()) return false;

		if (s.length()==0) return true;

		int count=0;
		for (int i=0;i<t.length();i++){
			if (s.charAt(count) == t.charAt(i)){
				count++;
				if (count == s.length()) return true;
			}
		}

        return false;
    }
}
// @lc code=end

