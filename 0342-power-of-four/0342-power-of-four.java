class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
        {
            return true;
        }
        
        if(n%4 == 0)
        {
            int pow=1;
            for(int i=0;i<n/4;i++)
            {
                pow=pow*4;
                if(n==pow)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}