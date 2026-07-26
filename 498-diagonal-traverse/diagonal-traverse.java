class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
 
        int ans[] = new int[n*m];

        int totalDiagonal = n + m - 1;//total number of diagonal posiible in a n*m matrix

        int d = 0;//indicates how many diagonal we traverse till now


        int row = 0;
        int col = 0;
        int idx = 0;
        while(d < totalDiagonal){

            //top diagonal which start from the first row 
            if(d<m){
                row = 0;
                col = d;
            }
            else{
                col = m-1;
                row = d-col;
            }
            ArrayList<Integer>list = new ArrayList<>();
            while(row<n && col>=0){
               list.add(mat[row][col]);
               row++;
               col--;
            }
            
            if(d%2==0)
                Collections.reverse(list);

            for(int it:list)
                ans[idx++] = it;

            
            d++;
        }

        return ans;

    }
}