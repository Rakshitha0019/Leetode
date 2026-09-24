class Solution {
    public int smallestIndex(int[] nums) {
        int len=nums.length;
        int mi=-1;
        for(int i=0;i<len;i++)
        {
            int sum=0;
            int x=nums[i];
            while(x!=0)
            {
                int rem=x%10;
                sum=sum+rem;
                x=x/10;
            }
            mi=Math.min(mi,sum);
            if(i==sum)
            {
                return i;
            }
        }
        return -1;
        
    }
}