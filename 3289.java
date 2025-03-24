//3289. The Two Sneaky Numbers of Digitville

class Solution {

   public int[] getSneakyNumbers(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
      // List<Integer> result = new ArrayList<>();
      //** We can use Array instead of list */


       int[] ar = new int[2];


       // for(int i =0;i<nums.length;i++){
       //     Integer val = map.get(nums[i]);


       //     if(val == null){
       //         map.put(nums[i],1);
       //     }
       //     else{
       //         map.put(nums[i],val+1);
       //     }
       // }
     //** We can use getorDefault method instead of above for loop */
     
       for (int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
       }
      int i = 0;
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
       if(entry.getValue()==2){
           ar[i] = entry.getKey();
           i++;
           //result.add(entry.getKey());
       }
      }
      //return new int[]{result.get(0),result.get(1)};
      return ar;
   }
}
