class Solution {
    int[] dx=new int[]{1,-1,0,0};
    int[] dy=new int[]{0,0,1,-1};
    public int minDays(int[][] grid) {
        int initial=countInslands(grid);
        if(initial!=1)
            return 0;
            
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    int count=countInslands(grid);
                    if(count!=1)
                        return 1;
                    grid[i][j]=1;
                }
            }
        }
        return 2;

    }
    int countInslands(int grid[][]){
        int count=0;
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]==false && grid[i][j]==1){
                    count++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return count;
    }
    void dfs(int i,int j,int grid[][],boolean vis[][]){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0||vis[i][j])
            return;
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            dfs(i+dx[k],j+dy[k],grid,vis);
        }
        
    }
}