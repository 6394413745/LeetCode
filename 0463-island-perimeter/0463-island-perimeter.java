class Solution {
    public int islandPerimeter(int[][] grid) {
       int m = grid.length;
       int n = grid[0].length; 

       int land = 0;
       int shared = 0;
       for(int i = 0;i<m;i++){
        for(int j = 0;j<n;j++){
            if(grid[i][j] == 1){
                land++;

                if(j+1 < n && grid[i][j+1] == 1){
                    shared++;
                }
                if(i+1 < m && grid[i+1][j] == 1){
                    shared++;
                }
            }
        }
       }
       return land * 4 - shared * 2;
    }
}