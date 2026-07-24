class Solution {
    ArrayList<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // i think this is pick or not pick condition  
        //lets think 
       Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        find_answer(nums,0,list);
        return l;

        
    }
    public void find_answer(int[] num , int index , ArrayList<Integer> list){
        if(index==num.length){
            l.add(new ArrayList<>(list));
            return ;
        }
           
        list.add(num[index]);
       
        find_answer(num,index+1,list);
         list.remove(list.size()-1);
     while(index+1<num.length && num[index+1]==num[index]){
            index++;
        }
         find_answer(num,index+1,list);
    }
}
