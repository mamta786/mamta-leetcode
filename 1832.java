//Check if the Sentence Is Pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> letters = new HashSet<>();
        char[] charArray = sentence.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= 'a' && c <= 'z') { 
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }
}
