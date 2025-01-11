//2108. Find First Palindromic String in the Array

class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";

        String[] palindromeArray = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            System.out.println(i);
            String st = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {

                st = st + String.valueOf(words[i].charAt(j));

            }
            palindromeArray[i] = st;
               if (palindromeArray[i].equals(words[i])) {
                result = palindromeArray[i];
                break;
            }
        }

        return result;
    }
}
