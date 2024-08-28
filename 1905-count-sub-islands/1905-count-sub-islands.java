
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid1.length,n=grid1[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid1[i][j]==0 && grid2[i][j]==1){
                    dfs(i,j,grid2);
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    dfs(i,j,grid2);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(int i, int j, int[][] grid2) {
        if(i<0 || j<0 || i>=grid2.length || j>=grid2[0].length || grid2[i][j]==0)
            return;
        grid2[i][j]=0;
        dfs(i+1,j,grid2);
        dfs(i-1,j,grid2);
        dfs(i,j+1,grid2);
        dfs(i,j-1,grid2);
    }
}
