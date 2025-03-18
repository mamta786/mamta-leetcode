//345. Reverse Vowels of a String

class Solution {
   public String reverseVowels(String s) {


     char[] sArray = s.toCharArray(); 
     int j = sArray.length-1;
     for(int i =0;i<j;i++){
       if(isVowel(sArray[i])){
           for(;j>i;){
               if(isVowel(sArray[j])){
                   char temp = sArray[j];
                   sArray[j] = sArray[i];
                   sArray[i] = temp;
                   j--;
                   break;
                  
               }
               j--;
               
           }  
       }
     } 
     return new String(sArray);
      
   }
   public boolean isVowel(char c){
       return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ;
   }
}
