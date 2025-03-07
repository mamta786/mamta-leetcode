// 1945. Sum of Digits of String After Convert
class Solution {
    public int getLucky(String s, int k) {

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            temp = temp + ((s.charAt(i) - 'a') + 1);
        }
        for (int i = 0; i < k; i++) {

            int num = 0;
            for (int j = 0; j < temp.length(); j++) {
                num = num + Character.getNumericValue(temp.charAt(j));

            }
            temp = String.valueOf(num);

        }
        return Integer.parseInt(temp);
    }
}
