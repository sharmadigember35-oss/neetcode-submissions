class Solution {
     ArrayList<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        ArrayList<Integer>list = new ArrayList<>();
          find_answer(nums,0,list);
         return l;
        
    }
    public void find_answer(int[] nums , int index , List<Integer> list){
         
            if(index == nums.length){
                  l.add(new ArrayList<>(list));
                  return  ;
            }
            list.add(nums[index]);
            find_answer(nums,index+1,list);
            list.remove(list.size()-1);
            find_answer(nums,index+1,list);
    }
}
