//3461. Check If Digits Are Equal in String After Operations I


class Solution {
   public boolean hasSameDigits(String s) {


      
        for(;s.length()>2;){
           String m ="";
       for(int i =0;i<s.length()-1;i++){
           int temp = Character.getNumericValue(s.charAt(i))+Character.getNumericValue(s.charAt(i+1));
           m=m+(Integer.valueOf(temp)%10);   
       }
       s=m;
       }
  
       return (s.length()==2 && (s.charAt(0)==s.charAt(1)));
   }


}
