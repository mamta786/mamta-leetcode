// 3174. Clear Digits


class Solution {
   public String clearDigits(String s) {


       for (int i = 0; i < s.length(); i++) {
           // System.out.println(i + " " + Character.isDigit(s.charAt(i)) + " " + s);
           if (Character.isDigit(s.charAt(i)) && i != 0 && !Character.isDigit(s.charAt(i - 1))) {
               s = s.substring(0, i - 1) + s.substring(i + 1);
               i = 0;
               // System.out.println(s);


           }


       }
       return s;
   }
}
