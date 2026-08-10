class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        int k=0;
        int res[]=new int[n];
        while(i<n || j<n)
        {
            if(nums[k]>0)
            {
                res[i]=nums[k];
                i=i+2;
            }
            else 
            {
                res[j]=nums[k];
                j=j+2;
            }
            k++;
        }
        return res;

        
    }
}