// 3019. Number of Changing Keys

class Solution {
    public int countKeyChanges(String s) {
        String key = s.toLowerCase();
        int count=0;
        for(int i =0;i<key.length()-1;i++){
            if(key.charAt(i)!=key.charAt(i+1)){
                count++;
            }
        }
      return count;
        
    }
}
