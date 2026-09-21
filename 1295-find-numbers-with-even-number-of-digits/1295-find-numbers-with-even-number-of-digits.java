class Solution {
    public int findNumbers(int[] nums) 
    {    
        int count=0;    
        for(int i=0;i<nums.length;i++){
         int x=nums[i];
         
         int c=0;
         while(x!=0)
         {
            c++;
           x=x/10;
         }
         if(c%2==0)
         {
          count++;
         }

        }
       
    
      return count;
    }
    
    
}