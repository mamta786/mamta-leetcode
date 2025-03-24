// 1512. Number of Good Pairs


class Solution {
   public int numIdenticalPairs(int[] nums) {
       int count = 0;
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       for (int i = 0; i < nums.length; i++) {
           Integer val = map.get(nums[i]);
           if (val == null) { // val does not exist in map
               map.put(nums[i], 1);
           } else { // val exists in map already
               // increase count by no of times nums[i] seen previously
               count = count + val;
               // increase by 1 because we see same num[i] one more time now in additon to how many times we had seen earlier
               map.put(nums[i], val + 1);
           }
       }
       return count;
   }
}

//****2nd option to solve the question:-
// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int count =0;

//         for(int i =0;i<nums.length-1;i++){
//             for(int j =1;j<nums.length;j++){

//                 if(i<j && nums[i]==nums[j]){
//                     count++;
//                 }

//             }
//         }
//       return count;  
//     }
// }
