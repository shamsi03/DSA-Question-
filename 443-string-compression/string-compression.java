class Solution {
    public int compress(char[] chars) {
        
        int idx = 0; // for modifying the char array
        for(int i=0;i<chars.length;i++)
        {
            char ch = chars[i];
            int count = 0; //count the frequency of the each character

            while(i<chars.length && ch == chars[i])
            {
                count++;
                i++;
            }

            if(count == 1) 
                chars[idx++] = ch; // store only character
            else{
                chars[idx++] = ch; //store character

                String str = String.valueOf(count);
                for(char ch1 : str.toCharArray())
                    chars[idx++] = ch1;  //then store frequency of that 
            }

            i--; // ek baar loop me already i++ kar de rahe hai isliye usko maintain karne k liye 

        }

        return idx;  // yahan tk hi mera compress charcater array hoga 
    }
}