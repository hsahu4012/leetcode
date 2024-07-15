/*
 * @lc app=leetcode id=2485 lang=java
 *
 * [2485] Find the Pivot Integer
 */

// @lc code=start
class Solution {
    public int pivotInteger(int n) {
        int ans = (n * n + n) / 2;
        int sq = (int) Math.sqrt(ans);
        if (sq * sq == ans)
            return sq;
        else
            return -1;
    }
}
// @lc code=end
