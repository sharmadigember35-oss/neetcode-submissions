class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr_1 = new int[26];
        int[] arr_2 = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr_1[c-'a']++; // if we get same character we increase the value 
            
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            arr_2[c-'a']++;
        }
        if(arr_1.length!=arr_2.length){
            return false;
        }
        for(int i=0;i<arr_1.length;i++){
            if(arr_1[i]!=arr_2[i]){
                return false;
            }
        }
      return true;
    }
}
