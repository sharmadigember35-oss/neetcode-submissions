class Solution {
    public int[] productExceptSelf(int[] nums) {

    // think about the condition 
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    left[0]=1;
    for(int i=1;i<left.length;i++){
        // now think about the conditon 
        left[i]= left[i-1]*nums[i-1];

    }
    right[right.length-1] = 1;
    for(int i=right.length-2;i>=0;i--){
        right[i] = right[i+1]*nums[i+1];
    }

    // perfome solution think think 
    int[] ans = new int[nums.length];
    for(int i=0;i<ans.length;i++){
        ans[i] = left[i]*right[i];
    }
    return ans;
        
    }
}  
