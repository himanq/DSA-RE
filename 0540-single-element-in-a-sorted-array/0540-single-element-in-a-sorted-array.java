class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if (nums.length == 1) {
            return nums[0];
        }
            if(i==0){//first element hai
               if(nums[i]!=nums[i+1])return nums[i];
            }   
            else if(i==nums.length-1){//last element hai
                if(nums[i]!=nums[i-1])return nums[i];
            }
            else { //jo beech mein element aae
               if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])return nums[i];
            }
        }
        return -1;
    }
}