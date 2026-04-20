class Solution {
    public int maxDistance(int[] colors) {
        
        int maxDis = 0;
        for(int i=0;i<colors.length-1;i++){
            for(int j=i;j<colors.length;j++){
                if(colors[i] != colors[j]){
                    int absVal = Math.abs(i-j);
                    maxDis = Math.max(absVal,maxDis);
                }
            }
        }

        return maxDis;
    }
}