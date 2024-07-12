/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if (!Character.isLetterOrDigit(c1))
                left++;
            else if (!Character.isLetterOrDigit(c2))
                right--;
            else {
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2))
                    return false;
                left++;
                right--;
            }
        }

        return true;
    }
}
// @lc code=end
