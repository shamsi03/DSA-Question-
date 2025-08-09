class Solution {
    public boolean isPowerOfTwo(int n) {
        // boolean check = false;

        // if(n==1)
        //     return true;

        // while(n>1)
        // {
        //     if(n%2==0){
        //         n = n/2;
        //         check = true;
        //     }
        //     else
        //         return false;

        // }
        
        // return check;


        if(n<=0)
            return false;
        
        return (n&(n-1)) == 0;
    }
}