class Solution {
    public int characterReplacement(String s, int k) {
        // borut force code to solve this problem think----
        /*int res =0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> hash = new HashMap<>();
             int max =Integer.MIN_VALUE;
            for(int j=i;j<s.length();j++){
                hash.put(s.charAt(j),hash.getOrDefault(s.charAt(j),0)+1);
              max = Math.max(max,hash.get(s.charAt(j)));

               if((j-i+1)-max<=k){
                res = Math.max(res,j-i+1);
               }
            }
        }
        return res;*/
        // now solve by sliding window 
        // instead of loop under O(n^2)  we can use slidning window and two pint 
        int left =0;
        int res =0;
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
            max = Math.max(max,hash.get(s.charAt(i)));
            while((i-left+1)-max >k){
                hash.put(s.charAt(left),hash.get(s.charAt(left))-1);
                left++;
            }
           
                res = Math.max(res,i-left+1);
             
            
             
        }

        return res;
    }
}
