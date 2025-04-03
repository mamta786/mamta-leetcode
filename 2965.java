//2965. Find Missing and Repeated Values

class Solution {
   public int[] findMissingAndRepeatedValues(int[][] grid) {


       Set<Integer> st = new HashSet<>();
       //Grid size is already given n*n. Here 'n' is grid.length.
       int grid_size = grid.length*grid.length;
       int repeated_num = -1;
       int actualSum = 0;


       for(int i =0;i<grid.length;i++){
           for(int j =0;j<grid.length;j++){
               int value = grid[i][j];
               actualSum=actualSum+value;


            if(st.contains(value)){
               repeated_num=value;
            }
            else{
               st.add(value);
            }
           }
       }
       int expectedSum = grid_size*(grid_size+1)/2;
       int missing_num = expectedSum-(actualSum-repeated_num);
      
       return new int[]{repeated_num,missing_num};
      
   }
}
