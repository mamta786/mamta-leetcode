// 3162. Find the Number of Good Pairs I


class Solution {
   public int numberOfPairs(int[] nums1, int[] nums2, int k) {


       int count =0;


       for(int val1:nums1){
      
           for(int val2:nums2){
          
               if(val1%(val2*k)==0){
                  
                   count++;
               }
           }
       }
       return count;
   }
}
