// Kth Distinct String in an Array

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (String s : arr) {
             countMap.put(s, countMap.getOrDefault(s, 0) + 1);
            
        }

        for (String s : arr) {
            if (countMap.get(s) == 1) {
                k--;
            }
            if (k==0)
                return s;
        }

        return "";

        //  List<String> distinct = new ArrayList<>();

        //  for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         distinct.add(entry.getKey());
        //     }
        // }

        // if (distinct.size() < k)
        //     return "";

        // return distinct.get(k-1);
        
    }
}
