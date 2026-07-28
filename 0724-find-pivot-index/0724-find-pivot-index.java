class Solution {
    public int pivotIndex(int[] nums){
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        for(int j=0;j<n;j++)
        {
            if(j==0)
            {
                if(0==nums[n-1]-nums[j])
                return j;
            }
            else
            {
                if(nums[j-1]==nums[n-1]-nums[j])
                return j;
            }
        }
        return -1;

        
    }
}