// 2810. Faulty Keyboard

class Solution {
    public String finalString(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 'i') {

                result.append(s.charAt(i));

            } else {
                result.reverse();
            }

        }

        return result.toString();

    }
}
