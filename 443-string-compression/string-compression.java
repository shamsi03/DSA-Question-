class Solution {
    public int compress(char[] chars) {
        
        int idx = 0;
        for(int i=0;i<chars.length;i++)
        {
            char ch = chars[i];
            int count = 0;

            while(i<chars.length && ch == chars[i])
            {
                count++;
                i++;
            }

            if(count == 1) 
                chars[idx++] = ch;
            else{
                chars[idx++] = ch;

                String str = String.valueOf(count);
                for(char ch1 : str.toCharArray())
                    chars[idx++] = ch1;
            }

            i--;

        }

        return idx;
    }
}