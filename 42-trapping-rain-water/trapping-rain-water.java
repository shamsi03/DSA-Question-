class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            left[i]=mx;
            if(height[i]>mx)
                mx=height[i];
        }
        int right[] = new int[n];
        mx=0;
        for(int i=n-1;i>=0;i--){
            right[i]=mx;
            if(height[i]>mx)
            mx=height[i];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int mn=Math.min(left[i],right[i]);
            int w=mn-height[i];
            if(w>0){
                ans+=w;
            }
        }
        return ans;
    }
}