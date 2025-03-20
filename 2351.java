// 2351. First Letter to Appear Twice


class Solution {
   public char repeatedCharacter(String s) {
      
       char c=' ';
       HashSet<String> st = new HashSet<>();


       for(int i =0;i<s.length();i++){


           if(!st.add(String.valueOf(s.charAt(i)))){
            c= s.charAt(i);
            break;


           }
        
       }
     return c; 
   }
}
