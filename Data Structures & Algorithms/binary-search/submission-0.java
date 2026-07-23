class Solution {
    public int search(int[] nums, int target) {
        int i =0;
        int j=nums.length-1;
        while(j>=i){
            int mid = i+(j-i)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
              i = mid+1;
            }
            
        }
        return -1;
        
    }
}
