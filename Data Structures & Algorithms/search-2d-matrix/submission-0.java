class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int i =0;
        int j=arr[0].length-1;
        
        while(i<arr.length && j>=0){
            int s = arr[i][j];
            if(s==target){
                return true;
            }
            else if(s>target){
                j--;
            }
            else{
              i++;
            }
        }
        // think about the condition 
       return false; 
    }
}
