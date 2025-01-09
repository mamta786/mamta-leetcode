//2185. Counting Words With a Given Prefix

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref.length()) {

                String prefix = "";
                for (int j = 0; j < pref.length(); j++) {
                    String[] na = new String[pref.length()];
                    na[j] = "" + words[i].charAt(j);
                    prefix = prefix + na[j];
                    if (pref.equals(prefix)) {
                        count++;
                    }

                }

            }

        }

        // for (int i = 0; i < words.length; i++) {
        //     // Skip words that are shorter than the prefix
        //     if (words[i].length() >= pref.length()) {
        //         // Extract the prefix of the current word and compare with 'pref'
        //         String prefix = words[i].substring(0, pref.length());
        //         if (prefix.equals(pref)) {
        //             count++;
        //         }
        //     }
        // }

        return count;
    }
}
