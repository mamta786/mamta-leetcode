// 3168. Minimum Number of Chairs in a Waiting Room


class Solution {
   public int minimumChairs(String s) {


       int current_person_count = 0;
       int current_chair_count = 0;


       for (int i = 0; i < s.length(); i++) {


           if (s.charAt(i) == 'E') {


               current_person_count = current_person_count + 1;
               if (current_chair_count >= current_person_count) {
                   current_chair_count = current_chair_count;


               } else {
                   current_chair_count = current_person_count;


               }


           } else {


               current_person_count = current_person_count - 1;
           }
       }
       return current_chair_count;


   }
}
