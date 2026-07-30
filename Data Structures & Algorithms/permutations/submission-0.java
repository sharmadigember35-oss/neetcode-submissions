class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // i want to find the perumation of number how lets think 
        ArrayList<List<Integer>> l = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        // now think more about the condition ''
        boolean[] ans =  new boolean[nums.length];
        int i =0;
        // think bro 

        find_answer(nums,ans,i,l,list);
        return l;
        
    }
    public static void find_answer(int[] nums, boolean[] ans , int i , ArrayList<List<Integer>> l, ArrayList<Integer> list){
        if(list.size()==nums.length){
            l.add(new ArrayList<>(list));
            return;
        }
        if(i>nums.length-1){
            return;
        }
        // now think about more the condition 
        for(int j=0;j<ans.length;j++){
            if(!ans[j]){
                ans[j]=true;
                list.add(nums[j]);
                find_answer(nums,ans,i+1,l,list);
                list.remove(list.size()-1);
                 ans[j]=false;
                 

            }
            
        }

    }
}
