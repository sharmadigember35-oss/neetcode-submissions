class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // while giving answer we have to give one based indexing 
        //[1,2,3,4] target = 3;
        int[] ans = new int[2];
        // by using two loop it give time limt exceed 
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int n  = target-numbers[i];
            if(hash.containsKey(n)){
               ans[0] = hash.get(n)+1;
               ans[1]= i+1;
            }
            hash.put(numbers[i],i);
        }
        
       
          return ans;
    }
}
