//1365. How Many Numbers Are Smaller Than the Current Number


class Solution {
   public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] ar = new int[nums.length];


       for(int i =0;i<nums.length;i++){
           int count =0;
           for(int j =0;j<nums.length;j++){
               if(j!=i && nums[j]<nums[i]){
                   count++;
                   ar[i]=count;
               }
               else{
                     ar[i]=count;
               }


           }
       }


      return ar;
   }
}

// 2nd Solution:

// class Solution {
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] ar = new int[501];
//        int[] presum = new int[501];
//        int[] result = new int[nums.length];


//        for(int i =0;i<nums.length;i++){
//            ar[nums[i]]=ar[nums[i]]+1;
//            System.out.println(ar[i]);
//        }
//        presum[0]=ar[0];
//        for(int i =1;i<501;i++){
//            presum[i] = presum[i-1]+ar[i];
//            System.out.println("*****");
//            System.out.println(presum[i]);
//        }
//        for(int i =0;i<nums.length;i++){
//            result[i]=presum[nums[i]]-ar[nums[i]];
//            System.out.println("========");
//            System.out.println(result[i]);
//            System.out.println("^^^^^^^^^");
//        }
//        return result;
//    }
// }
