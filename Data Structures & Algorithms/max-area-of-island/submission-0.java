class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && visited[i][j]!=true){
                  int area =   bfs_travers(grid,visited,i,j);
                  max = Math.max(area,max);
                }
            }
        }
        return max;
        
    }
    public int bfs_travers(int[][] grid, boolean[][] visited, int row , int col){
        int count =1;
        Queue<Pair> q = new LinkedList<>();
        Pair p = new Pair(row,col);
        q.offer(new Pair(row,col));
        visited[row][col]=true;
        int[] r = {-1,1,0,0};
        int[] co = {0,0,-1,1};
        while(!q.isEmpty()){
            Pair c = q.poll();
            int n_row = c.row;
            int n_col = c.col;
            for(int k=0;k<4;k++){
                int newrow = n_row+r[k];
                int newcol = n_col+co[k];
                if(newrow>=0 && newrow<grid.length && newcol>=0 && newcol<grid[0].length && visited[newrow][newcol]!=true && grid[newrow][newcol]==1  ){
                    count++;
                    visited[newrow][newcol]=true;
                    
                    q.offer(new Pair(newrow,newcol));
                }
            }
        }
        return count;
    }
}
