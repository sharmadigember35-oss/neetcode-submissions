class Solution {
    public int lastStoneWeight(int[] stones) {
        // we can solve this using 
         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int ans =0;
        for(int s : stones){
            pq.offer(s);
        }
        while(pq.size()>1){
            // now think 
            int first_larges = pq.poll();
            int second_larges = pq.poll();
            pq.offer(first_larges-second_larges);
        }
        ans = pq.poll();
        return ans;
    }
}
