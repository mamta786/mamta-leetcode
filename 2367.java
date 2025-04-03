//2367. Number of Arithmetic Triplets


class Solution {
   public int arithmeticTriplets(int[] nums, int diff) {


       int count=0;
       Set<Integer> st = new HashSet<>();
       for(int num:nums){
           st.add(num);
       }


       for(int num:nums){
           if(st.contains(num+diff) && st.contains(num+2*diff)){
               count++;
           }
       }
      return count;
   }
}


//2nd Solution:

// class Solution {
//     public int arithmeticTriplets(int[] nums, int diff) {


//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 for(int k=0;k<nums.length;k++){
//                     if(i<j && j<k && (nums[j]-nums[i]==diff)&&(nums[k]-nums[j]==diff)){
//                         System.out.println(i+ "," +j +","+ k);
//                         count++;
//                     }
//                 }
//             }
//         }
//                     return count;
//                 }
//             }
