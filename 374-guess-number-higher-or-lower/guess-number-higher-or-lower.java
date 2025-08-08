/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int num) {
        int low = 0 , high = num;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int result = guess(mid);

            if(result == 0)
                return mid;
            else if(result == 1) //look for the right side
                low = mid+1;
            else //looking for the left side
                high = mid-1;
        }

        return 1; //aise hi sirf
    }
   
}