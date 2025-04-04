// 1748. Sum of Unique Elements

class Solution {
   public int sumOfUnique(int[] nums) {
       int sum =0;
       Map<Integer,Integer> countOfNums = new HashMap<>();


       for(int num:nums){
         countOfNums.put(num,countOfNums.getOrDefault(num,0)+1); 
       }


       List<Integer> uniqueValue = new ArrayList<>();
       for(int num:nums){
           if(countOfNums.get(num)==1){
              uniqueValue.add(num);
           }
       }


       for(int num:uniqueValue){
           sum=sum+num;
       }
       return sum;
   }
}
