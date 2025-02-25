// 2788. Split Strings by Separator


class Solution {
   public List<String> splitWordsBySeparator(List<String> words, char separator) {
      
       ArrayList<String> arlist = new ArrayList<>();
       ArrayList<String> finallist = new ArrayList<>();
       for(int i =0;i<words.size();i++){
         
          arlist.addAll(Arrays.asList(words.get(i).split(java.util.regex.Pattern.quote(String.valueOf(separator)))));
          
       }
     
       for(int i =0; i<arlist.size();i++){
           if(arlist.get(i)!=""){
            finallist.add(arlist.get(i));
           }
       }
       return finallist;
   }
}
