class KthLargest {
  // let's understand he concept 
  PriorityQueue<Integer>  pq ;
  int K ;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        K = k;
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>K){
            pq.poll();
        }
        return pq.peek();
        
    }
}
