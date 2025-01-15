// 2697. Lexicographically Smallest Palindrome

class Solution {
    public String makeSmallestPalindrome(String s) {

        String result = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {

            if (c[i] != c[c.length - 1 - i] && c[i] > c[c.length - 1 - i]) {
                c[i] = c[c.length - 1 - i];

            }
            result = result + String.valueOf(c[i]);
        }
        return result;
    }
}
