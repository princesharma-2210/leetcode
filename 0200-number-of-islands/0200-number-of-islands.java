class Solution {
    public static void dfs(int i, int j, int[] row, int[] col, int[][] vis, char[][] grid){
        vis[i][j]=1;
        for(int z=0; z<4; z++){
            int rhv= i+row[z];
            int chv= j+col[z];
            if(rhv>=0 && rhv<grid.length && chv>=0 && chv<grid[0].length && vis[rhv][chv]==0 && grid[rhv][chv]=='1'){
                dfs(rhv,chv,row,col,vis,grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int vis[][]= new int[grid.length][grid[0].length];
        int row[]= {-1,0,0,1};
        int col[]= {0,-1,1,0};
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    dfs(i,j,row,col,vis,grid);
                }
            }
        }
        return count;
    }
}