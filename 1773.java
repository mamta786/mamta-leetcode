// 1773. Count Items Matching a Rule


class Solution {
   public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int count = 0;
       // System.out.println("items : " + items);


       for (int i = 0; i < items.size(); i++) {
           List<String> innerItems = items.get(i);
           // System.out.println("innerItems: " + innerItems);
           // System.out.println("innerItems[0]: " + innerItems.get(0));


           if (ruleKey.equals("type") && ruleValue.equals(innerItems.get(0))) {
               count++;


           } else if (ruleKey.equals("color") && ruleValue.equals(innerItems.get(1))) {
               count++;
           } else if (ruleKey.equals("name") && ruleValue.equals(innerItems.get(2))) {
               count++;
           }


       }


       return count;


   }
}
