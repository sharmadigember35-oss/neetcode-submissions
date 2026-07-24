class Solution {
    ArrayList<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
         find_answer(nums,0,target,list);
        return l;
    }
    public  void find_answer(int[] nums , int i , int target , ArrayList<Integer> list){
        if(target==0){
            l.add(new ArrayList(list));
            return;
        }
        if(target<0 || i==nums.length){
            // return then condition 
            return ;
        }
        list.add(nums[i]);
        find_answer(nums,i,target-nums[i],list);
        list.remove(list.size()-1);
        find_answer(nums,i+1,target,list);

    }
}
