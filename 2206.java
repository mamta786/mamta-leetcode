// 2206. Divide Array Into Equal Pairs


class Solution {
   public boolean divideArray(int[] nums) {


       boolean result = false;
       Arrays.sort(nums);


       if (nums.length % 2 !=0)
           return false;


       for(int i =0;i<nums.length;i+=2){
           if(nums[i]!=nums[i+1]){
               return false;
           }
       }
      
     return true; 
   }
}
