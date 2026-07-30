class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ev=0;
        int n=nums.length;
        int odd=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                res[ev]=nums[i];
                ev=ev+2;
            }
            else
            {
                res[odd]=nums[i];
                odd=odd+2;
            }
        }
        return res;
        
    }
}