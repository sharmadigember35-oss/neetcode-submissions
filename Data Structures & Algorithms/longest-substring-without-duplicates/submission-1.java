class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j =0;
        int max  = Integer.MIN_VALUE;
        HashSet<Character> hash = new HashSet<>();
        if(s.length()==0){
            return 0;
        }
        // now think about the condition 
        while(j<s.length()){
            while(hash.contains(s.charAt(j))){
                hash.remove(s.charAt(i));
                i++;
            }
             hash.add(s.charAt(j));
            max = Math.max(max,j-i+1);
            
            j++;
        }
        return max;
        
    }
}
