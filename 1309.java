//1309. Decrypt String from Alphabet to Integer Mapping


class Solution {
   public String freqAlphabets(String s) {
       String sm = "";


       char[] ar = new char[26];


       for (int i = 0; i < 26; i++) {
           ar[i] = (char) ('a' + i);
       }
       for (int i = 0; i < s.length(); i++) {
          
           if (i < s.length() - 2 && Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))
                   && s.charAt(i + 2) == '#') {


               int k = Integer.parseInt("" + s.charAt(i) + s.charAt(i + 1));
               i = i + 2;
               sm = sm + String.valueOf(ar[k - 1]);
           } else {
               int k = Integer.parseInt("" + s.charAt(i));
               sm = sm + String.valueOf(ar[k - 1]);
           }
       }
       return sm;
   }
}
