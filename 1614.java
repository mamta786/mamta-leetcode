// 1614. Maximum Nesting Depth of the Parentheses

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        // StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                depth++;

                if (maxDepth < depth) {
                    maxDepth = depth;
                }
                // maxDepth = Math.max(maxDepth, depth);
            }

            else if (c == ')') {
                depth--;
            }

        }
        return maxDepth;

    }
}
