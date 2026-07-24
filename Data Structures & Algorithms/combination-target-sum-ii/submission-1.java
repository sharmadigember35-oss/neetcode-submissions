class Solution {
    ArrayList<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        // now think about the condition
        Arrays.sort(candidates);
        find_answer(candidates,0,target,list);
        return l;
    }
    public void find_answer(int[] num , int i , int target, ArrayList<Integer> list){
        if(target==0){
            l.add(new ArrayList<>(list));
            return;
        }
         if(target<0 || i==num.length){
            return;
         }
         if(num[i]>target){
            return;
         }
        list.add(num[i]);
        find_answer(num, i+1,target-num[i],list);
       
            list.remove(list.size()-1);
            while(i+1<num.length && num[i+1]==num[i]){
                i++;
            }
            find_answer(num,i+1,target,list);
        
        
    }
}
