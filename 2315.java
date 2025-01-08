//2315. Count Asterisks

class Solution {
    public int countAsterisks(String s) {
        Boolean inPair = false;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                inPair = !inPair;
            }
            if (inPair == false && s.charAt(i) == '*') {
                count++;

            }
        }
        return count;
    }
}
