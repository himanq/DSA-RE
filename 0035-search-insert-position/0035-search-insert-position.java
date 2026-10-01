class Solution {
    public int searchInsert(int[] nums, int target) {
        //lower bound hi hai
        int low=0;
        int high=nums.length-1;
        int lb=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                lb=Math.min(lb,mid);
                high=mid-1;

            }
            else low=mid+1;
        }
        return lb;
    }
}