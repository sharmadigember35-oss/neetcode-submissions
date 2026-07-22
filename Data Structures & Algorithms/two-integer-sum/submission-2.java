class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            int s = target-nums[i];
            // now think about the condition 
            if(hash.containsKey(s)){
                arr[0] = hash.get(s);
                arr[1] = i;
            }
            hash.put(nums[i],i);
        }

        return arr;
        
    }
}
