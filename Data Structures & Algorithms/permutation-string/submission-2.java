class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // how we solve this problem think 
        int[] num = new int[26];
        int[] window  = new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            num[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            window[s2.charAt(i)-'a']++;
        }
         // first check equal 
         if(equals(num,window)){
            return true;
         }
        int i=0;
        int j=s1.length();
        while(j<s2.length()){
             window[s2.charAt(j)-'a']++;
             if(j-i+1>s1.length()){
                window[s2.charAt(i)-'a']--;
                i++;
             }
             if(j-i+1==s1.length()){
                if(equals(num,window)){
                    return true;
                }
             }
             
             j++;
              
        }
        return false;
    }
    public boolean equals(int[] num, int[] window){
        // now think about the condition 
     
        for(int k=0;k<26;k++){
           
            if(num[k]!=window[k]){
                  return false;
            }
        
             
        }
        return true;
    }
}
