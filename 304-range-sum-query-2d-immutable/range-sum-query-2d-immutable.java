class NumMatrix {
    int arr[][];
    public NumMatrix(int[][] matrix) {
        arr = matrix;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
                arr[i][j] += arr[i][j-1];
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        if(col1 == 0)
        {   
            while(row2>=row1)
            {
                sum += arr[row1][col2];
                row1++;
            }
            return sum;
        }

        while(row2>=row1)
        {
            sum += arr[row1][col2]-arr[row1][col1-1];
            row1++;
        }

        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */