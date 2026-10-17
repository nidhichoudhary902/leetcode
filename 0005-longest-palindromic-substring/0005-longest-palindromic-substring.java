class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            String odd = s.substring(l + 1, r);
            if (odd.length() > ans.length()) {
                ans = odd;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            String even = s.substring(l + 1, r);
            if (even.length() > ans.length()) {
                ans = even;
            }
        }
        return ans;
    }
}