// 2864. Maximum Odd Binary Number

class Solution {
    public String maximumOddBinaryNumber(String s) {
        String sm = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (i < count - 1 || i == s.length() - 1) {
                sm = sm + 1;
            }

            else {
                sm = sm + 0;
            }
        }

        return sm;
    }
}

