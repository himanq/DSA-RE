class Solution {
    int sumLessThanEqualToK(int []nums,int goal){
         int left=0;
      int right=0;
      int count=0;
      int sum=0;
      if(goal<0)return 0;
      while(right<nums.length){
        sum=sum+nums[right];
         
        while(sum>goal){
            sum=sum-nums[left];
            left++;

        }
        count=count+(right-left+1);
        right++;
       
      } 
      return count; 
    }
    public int numSubarraysWithSum(int[] nums, int goal) {


      //humein subarray nikalna hai sum==goal ho hum yha pr
      //sum<=goal-sum<=goal-1  // nikla kr subtract krege taki ye sum==goal aajae


     return sumLessThanEqualToK(nums,goal)-sumLessThanEqualToK(nums,goal-1);
    }
}