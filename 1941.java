// 1941. Check if All Characters Have Equal Number of Occurrences

class Solution {
   public boolean areOccurrencesEqual(String s) {


       Map<Character,Integer> countMap = new HashMap<>();


       for(char c:s.toCharArray()){
           countMap.put(c,countMap.getOrDefault(c,0)+1);
       }


       int firstValue =-1;


       for (int value : countMap.values()) {


           if (firstValue == -1) {


               firstValue = value;


           } else if (firstValue != value) {
               return false;
           }
       }


       return true;
  
      
   }
}
