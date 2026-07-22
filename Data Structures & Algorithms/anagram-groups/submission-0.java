class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // first start a loop then add sort string then check 
        HashMap<String,ArrayList<String>> hash = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            // now think about the condition 
            String w = strs[i];
            char[] ch = w.toCharArray();
            // now think about the condition 
            Arrays.sort(ch);
            String word = new String(ch);
            if(!hash.containsKey(word)){
              hash.put(word,new ArrayList<>());
            }
            hash.get(word).add(w);
              
        }
        // now i have to add element 
        for(String w : hash.keySet()){
            list.add(hash.get(w));
        }
        // that how this is work 
      return list; 
    }
}
