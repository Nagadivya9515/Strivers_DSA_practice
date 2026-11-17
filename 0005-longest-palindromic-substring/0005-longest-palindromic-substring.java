class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, maxlen = 1;
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd-length palindrome
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxlen) {
                    start = left;
                    maxlen = right - left + 1;
                }
                left--;
                right++;
            }

            // Case 2: Even-length palindrome
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxlen) {
                    start = left;
                    maxlen = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return s.substring(start, start + maxlen);
    }
}
