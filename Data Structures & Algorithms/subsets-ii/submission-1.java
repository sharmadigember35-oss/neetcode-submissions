class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
          find_answer(nums,0,list,l);
         return list;

    }
    public void find_answer(int[] nums , int i,ArrayList<List<Integer>> list , ArrayList<Integer> l){
        // now thin about the condition 
        if(i==nums.length){
            list.add(new ArrayList<>(l));
            return ;
        }
        if(i>nums.length){
            return;
        }
        // now think more about the condition 
        l.add(nums[i]);
        find_answer(nums,i+1,list,l);
        l.remove(l.size()-1);
        while(i+1<nums.length && nums[i+1]==nums[i]){
            i++;
        }
        find_answer(nums,i+1,list,l);

    }
}
