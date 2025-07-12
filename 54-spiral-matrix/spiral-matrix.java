class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>li = new ArrayList<>();

        int row = matrix.length,col = matrix[0].length;
        int left = 0 , top = 0 , bottom = row-1 , right = col-1;
        while(left<=right && top<=bottom)
        {
            //first movement -> left to right
            for(int i=left;i<=right;i++)
                li.add(matrix[top][i]);
            top++;
            
            //second movement -> top to bottom
            for(int i=top;i<=bottom;i++)
                li.add(matrix[i][right]);
            right--;

            //third movement -> right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    li.add(matrix[bottom][i]);
                bottom--;
            }

            //fourth movement -> bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    li.add(matrix[i][left]);
                left++;
            }
            
        }

        return li;
    }
}