class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> list = new ArrayList<>();
        ArrayList<String> l = new ArrayList<>();
        // now think more 
        int start =0;
        find_answer(s,start,list,l);
        return list;
        
    }
    public void find_answer(String s , int start,ArrayList<List<String>> list , ArrayList<String> l){
        // now think about the condition 
        if(start == s.length()){
            list.add(new ArrayList<>(l));
            return;
        }
        // now think more about the condition 
        for(int end = start ;end<s.length();end++){
             if(is_palindrom(s,start,end)){
                 
                l.add(s.substring(start,end+1));
                find_answer(s,end+1,list,l);
                l.remove(l.size()-1);
             }
        }
    }
    public boolean is_palindrom(String s, int left, int right){
         
        while(right>=left){
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
