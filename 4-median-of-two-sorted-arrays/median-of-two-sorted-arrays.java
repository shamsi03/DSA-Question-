class Solution {
    public void merged(int[] arr1, int[] arr2, int m, int n , int[] merge)
        {
            int i=0,j=0,k=0;
            while(i<m && j<n)
            {
                if(arr1[i] < arr2[j])
                    merge[k++] = arr1[i++];
                else
                    merge[k++] = arr2[j++];
            }

            while(i<m)
                merge[k++] = arr1[i++];

            while(j<n)
                merge[k++] = arr2[j++];
        }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int merge[] = new int[m+n];
        double ans = 0.0;
        merged(nums1,nums2,m,n,merge);
        int size = merge.length;
        if(size%2 == 1)
            ans = (double) (merge[size/2]);
        else
            ans = (double) ((merge[size/2]+merge[(size/2)-1])/2.0);


        return ans;
    }
}