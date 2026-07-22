class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
         int max = Integer.MIN_VALUE;
         if(nums.length ==0){
            return 0;
         }

        for(int i=0;i<nums.length;i++){
              hash.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
             ArrayList<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            while(hash.contains(list.get(list.size()-1)+1)){
                list.add(list.get(list.size()-1)+1);
            }
             max = Math.max(max,list.size());
        }

        return max;
        
    }
}
