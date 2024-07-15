/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Pair<Integer, Integer>> mp = new HashMap<>();
        HashMap<Integer, Boolean> bl = new HashMap<>();
        int mx = 0;

        for (int i : nums) {
            if (bl.containsKey(i)) {
                continue;
            }
            bl.put(i, true);
            int l = i, r = i;

            if (mp.containsKey(i + 1)) {
                r = mp.get(i + 1).getKey();
            }
            if (mp.containsKey(i - 1)) {
                l = mp.get(i - 1).getValue();
            }
            mp.put(r, new Pair<>(r, l));
            mp.put(l, new Pair<>(r, l));
            mx = Math.max(mx, r - l + 1);
        }

        return mx;
    }
}
// @lc code=end
