//Unique Morse Code Words
class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        int count = 0;
        String[] letters = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        String[] morse_code = new String[words.length];
        Set<String> morse_code_set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String coded_string = "";
            
            for (int j = 0; j < words[i].length(); j++) {
                count = (words[i].charAt(j) - 'a');
                coded_string = coded_string + (letters[count]);

            }
            morse_code[i] = coded_string;
            morse_code_set.add(morse_code[i]);

        }
        return morse_code_set.size();
    }
}
