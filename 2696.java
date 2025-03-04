// 2696. Minimum String Length After Removing Substrings


class Solution {
   public int minLength(String s) {


       for (int i = 0; i < s.length()-1; ) {
           String temp = String.valueOf((s.charAt(i))+String.valueOf(s.charAt(i+1)));
           if (temp.equals("AB") || temp.equals("CD")) {
             
               s = s.replace(temp,"");
               i = 0;
           }
           else{
               i++;
           }
       }
       return s.length();
   }
}
