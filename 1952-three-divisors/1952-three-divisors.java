class Solution {
    public boolean isThree(int n) {
        if(n==1 || n==2 || n==3)
        {
            return false;
        }
        int count=1;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==3)
        {
            return true; 
            
       }
       else
       {
        return false;
       }
        
    }
}