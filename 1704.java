// 1704. Determine if String Halves Are Alike


class Solution {
   public boolean halvesAreAlike(String s) {
       String m = s.toLowerCase();
       int count = 0;
       int scount = 0;


       for (int i = 0; i < (m.length() / 2); i++) {


           if (vowelCount(m.charAt(i))) {
               count++;
           }


       }
       for (int i = (m.length() / 2); i < m.length(); i++) {


           if (vowelCount(m.charAt(i))) {
               scount++;
           }


       }


       if (count != scount) {
           return false;
       }
       return true;
   }


   public boolean vowelCount(char c){
       return c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ;
          
      
   }
}
