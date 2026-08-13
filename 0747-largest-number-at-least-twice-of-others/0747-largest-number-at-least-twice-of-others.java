class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=0;
        int smax=0;
        int index=-1;
        for(int i=0;i<n;i++)
        {
           if(nums[i]>max)
           {
            smax=max;
            max=nums[i];
            index=i;
           }
           else if(nums[i]>smax)
          {
            smax=nums[i];
          }
        }
        
        if(max>=2*smax)
        {
            return index;
        }
        return -1;
        
    }
}