class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] arr_k = new int[k];
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);

        }
         // here we add the array element and there frequence 
         int[][] arr = new int[hash.size()][2];
         int s =0;
         for(int i : hash.keySet()){
             arr[s][0] = hash.get(i);
             arr[s][1] = i;
             s++;

         }
         // now think about the condition 
         Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
         int t=0;
         for(int i= arr.length-1;i>=0;i--){
            
            
           if(t==k){
            break;
           }
           
           arr_k[t++] = arr[i][1];
           
           
         }
      return arr_k;  
    }
}
