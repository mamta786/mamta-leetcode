// 2103. Rings and Rods

class Solution {
    public int countPoints(String rings) {
        int count =0;

    Map<Integer,String> m = new HashMap<>();

    for(int i =1;i<rings.length();i+=2){
        char c = rings.charAt(i-1);
        int key = Integer.parseInt(""+rings.charAt(i));
        if(m.get(key)==null){
            String s = ""+c;
            m.put(key,s);
        }
        else{
           String s= m.get(key);
           s=s+c;
           m.put(key,s);
        }

    }

    for(Map.Entry<Integer,String> set:m.entrySet()){
       if(set.getValue().contains("B") && set.getValue().contains("R") && set.getValue().contains("G")){
        count++;
       }
    }

//System.out.println(m);


 return count;       

        
    }
}
