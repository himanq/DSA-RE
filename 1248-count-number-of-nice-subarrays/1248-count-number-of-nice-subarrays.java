class Solution {

    //similar to binary subarray with sum even =0//odd==1 mein convert kr liya (%2)lga ke

     int sumLessThanEqualToK(int []nums,int goal){
         int left=0;
      int right=0;
      int count=0;
      int sum=0;
      if(goal<0)return 0;
      while(right<nums.length){
        sum=sum+(nums[right]%2);
         
        while(sum>goal){
            sum=sum-(nums[left]%2);
            left++;

        }
        count=count+(right-left+1);
        right++;
       
      } 
      return count; 
    }
    public int numberOfSubarrays(int[] nums, int goal) {
         return sumLessThanEqualToK(nums,goal)-sumLessThanEqualToK(nums,goal-1);
    }
}