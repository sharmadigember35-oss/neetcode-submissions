class Solution {
    public boolean isSubsequence(String s, String t) {
        // int i whith is att s and j which is at t then 
        // if s.charAt(i)==t.charAt(j) i++ , j++ else j++ if i!=s.length() and j==t.length() return false 
        if(t.length()<s.length()){
            return false;
        }
        int i =0;
        int j=0;
        while(i<s.length() && j<t.length()){
            // now put the condition 
            if(s.charAt(i)==t.charAt(j)){
                i++;
                
            }
            j++;
           
        }
        if(i<s.length()){
            return false;
        }
        return true;
    }
}