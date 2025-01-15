// 1021. Remove Outermost Parentheses

class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int depth = 0;

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == '(') {

                if (depth > 0) {

                    sb.append(c[i]);
                }
                depth++;
            } else {
                depth--;

                if (depth > 0) {
                    sb.append(c[i]);
                }
            }

        }
        return sb.toString();

    }
}
