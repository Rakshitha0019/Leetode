class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
      while(i<j && j<nums.length)
        {

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i=i+2;
            j=i+1;
        }
        return nums;
        
    }
}