class Solution {
    public int closedIsland(int[][] grid) {
        int length = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    boolean check = dfs(grid,i,j,grid.length,grid[0].length);
                    if(check == true)
                        length++;
                }
            }
        }

        return length;
    }

    boolean dfs(int[][]grid,int row,int col,int n,int m)
    {
        if(row>=n || col>=m || row<0 || col<0)
            return false;
        if(grid[row][col]==1)
            return true;
            grid[row][col] = 1;

        boolean left =  dfs(grid,row,col-1,n,m); 
        boolean right = dfs(grid,row,col+1,n,m); 
        boolean top = dfs(grid,row-1,col,n,m); 
        boolean bottom = dfs(grid,row+1,col,n,m);
        return left && right && top && bottom;

    }
}