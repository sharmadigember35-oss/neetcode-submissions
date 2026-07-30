class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    public int numIslands(char[][] grid) {
        //  code kata jayga pata chalta jayga 
         boolean[][] visited = new boolean[grid.length][grid[0].length];
         int count =0;

         // now we make the two d array and fill it value -1 now think more about the conditon 
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                /// now think more about the condition 
                if(grid[i][j]=='1' && !visited[i][j]){
                    bfs_traversal(grid,visited,i,j);
                    count++;
                }
            }
         }
         return count;
        
    }
    public void bfs_traversal(char[][] grid , boolean[][] visited, int row , int col){
        Queue<Pair> q = new LinkedList<>();
        Pair p = new Pair(row,col);
      
        // now think about the condition 
        q.offer(new Pair(row,col));
        visited[row][col]= true;
         int[] row1 ={-1,1,0,0};
         int[] col1 = {0,0,-1,1};
        
        while(!q.isEmpty()){
            // now think about e
            Pair c = q.poll();
            for(int k=0;k<4;k++){
                // now think about the condition 
                int newrow = c.row+row1[k];
                int newcol = c.col+col1[k];
                if(newrow>=0 && newrow<grid.length && newcol>=0 && newcol<grid[0].length && visited[newrow][newcol]!=true&& grid[newrow][newcol]=='1'){
                    visited[newrow][newcol]=true;
                    q.offer(new Pair(newrow,newcol));
                }

            }
            
            
            // now think more about the condition 
             
        }
    }
}
