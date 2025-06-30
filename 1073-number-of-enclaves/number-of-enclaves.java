class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                // maine corner walo ko sirf check kara ki kya corner pe 1 hai ya nahi 
                if(i == 0 || j ==0 || i == n-1 || j == m-1){
                    if(grid[i][j]==1)
                    {
                        dfs(grid,i,j,grid.length,grid[0].length);
                    }
                }
            }
        }

        //jitne 1 bach jayenge wahi land cell aayega , wo boundary se connected honge hi nahi 
        int length = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                    length++;
            }
        }

       

        return length;
    }

    void dfs(int[][]grid,int row,int col,int n,int m)
    {
        if(row>=n || col>=m || row<0 || col<0){
            return;
        }

        if(grid[row][col]==0)
            return;

        //boundary se jitna connected hoga un sb ko 0 mark kar do 
        grid[row][col] = 0;

        // boolean left = dfs(grid,row,col-1,n,m);
        // boolean right = dfs(grid,row,col+1,n,m);
        // boolean top = dfs(grid,row-1,col,n,m);
        // boolean bottom = dfs(grid,row+1,col,n,m);

        // return left && right && top && bottom;

        dfs(grid,row,col-1,n,m);
        dfs(grid,row,col+1,n,m);
        dfs(grid,row-1,col,n,m);
        dfs(grid,row+1,col,n,m);
    }
}