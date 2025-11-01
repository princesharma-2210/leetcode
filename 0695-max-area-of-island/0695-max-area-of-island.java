class Solution {
    static class pair{
        int src;
        int dst;
        pair(int src,int dst){
            this.src= src;
            this.dst= dst;
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int vis[][]= new int[grid.length][grid[0].length];
        int r[]= {-1,0,0,1};
        int c[]= {0,-1,1,0};
        int maxArea=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    int area= bfs(i,j,r,c,grid,vis);
                    maxArea= Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
    public static int bfs(int row, int col, int[] r, int[] c,int[][] grid, int vis[][]){
        Queue<pair> q= new LinkedList<>();
        q.add(new pair(row,col));
        vis[row][col]= 1;
        int area=1;
        while(!q.isEmpty()){
            int fst= q.peek().src;
            int sec= q.peek().dst;
            q.poll();
            for(int i=0; i<4; i++){
                int rhv= fst+r[i];
                int chv= sec+c[i];
                if(rhv>=0 && rhv<grid.length && chv>=0 && chv<grid[0].length && vis[rhv][chv]==0 && grid[rhv][chv]==1){
                    vis[rhv][chv]= 1;
                    q.add(new pair(rhv,chv));
                    area++;
                }
            }
        }
        return area;
    }
}