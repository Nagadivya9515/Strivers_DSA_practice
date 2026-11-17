class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0, maxLen = 1;

        for (int l = 0; l < n; l++) {
            for (int r = l + 1; r < n; r++) {
                // Only check if this substring is longer than our current best
                if (r - l + 1 > maxLen && identifyPalindrome(s, l, r)) {
                    start = l;
                    maxLen = r - l + 1;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public boolean identifyPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
